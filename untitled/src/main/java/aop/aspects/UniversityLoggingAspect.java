package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: logging " +
//                "getStudents() before");
//    }

    //    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String name = firstStudent.getNameSurname();
//        name = "Mr." + name;
//        firstStudent.setNameSurname(name);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        firstStudent.setAvgGrade(avgGrade + 100);
//
//
//        System.out.println("afterGetStudentsLoggingAdvice: logging " +
//                "getStudents() after");
//    }

//    @AfterThrowing(pointcut = "execution(* aop.University.getStudents())", throwing = "exception")
//    public void afterThrowingAdvice(Throwable exception) {
//        System.out.println("afterThrowingAdvice: logging exception "+ exception);
//    }

    @After("execution(* aop.University.getStudents())")
    public void afterGetStudents() {
        System.out.println("afterGetStudents: logging after");
    }
}
