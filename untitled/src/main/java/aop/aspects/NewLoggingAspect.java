package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String aop.UniLibrary.returnBook())")
    public Object aroundAdv(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundAdv: try to return book");

        Object target = null;
        try {
            target = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundAdv: caught " + e);
//            target = "No data";
            throw e;
        }

        System.out.println("aroundAdv: returned book");

        return target;
    }
}
