package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary()&& !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnFromUniLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnFromUniLibrary()")
//    public void BeforeAllMethodsExceptReturnAdvice(){
//        System.out.println("BeforeAllMethodsExceptReturnAdvice: Log #10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void AllGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void AllReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("AllGetMethodsFromUniLibrary() || AllReturnMethodsFromUniLibrary()")
//    private void AllGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("AllGetMethodsFromUniLibrary()")
//    public void BeforeGetLoggingAdvice() {
//        System.out.println("BeforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("AllReturnMethodsFromUniLibrary()")
//    public void BeforeReturnLoggingAdvice(){
//        System.out.println("BeforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("AllGetAndReturnMethodsFromUniLibrary()")
//    public void BeforeGetAndReturnLoggingAdvice(){
//        System.out.println("BeforeGetAndReturnLoggingAdvice: writing Log #3");
//    }


    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] args = joinPoint.getArgs();
            for (Object x : args) {
                if (x instanceof Book) {
                    Book myBook = (Book) x;
                    System.out.println("Информация о книге: название - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() +
                            ", год - " + myBook.getYear());
                } else if (x instanceof String) {
                    System.out.println("Книгу добавил: " + x);
                }
            }
        }


        System.out.println("beforeAddLoggingAdvice: логирование  " +
                "попытки получить книгу/журнал");
        System.out.println("-------------------------------");
    }
}
