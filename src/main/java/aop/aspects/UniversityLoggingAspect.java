package aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {


//@Before("execution(* getStudents(..))")
//    public void BeforeGetStudentsLoggingAdvice(){
//    System.out.println("BeforeGetStudentsLoggingAdvice: логика предварительной проверки метода");
//}
//
//@AfterReturning(pointcut = "execution(* getStudents(..))",returning = "students")
//    public void AfterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint,List<Student> students){
//    int course = 0;
//    System.out.println("AfterReturningGetStudentsLoggingAdvice: логика работы метода после его завершения");
//    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//    if (methodSignature.getName().equals("getStudents")){
//        Object[] args = joinPoint.getArgs();
//        course = (int) args[0];
//        }
//
//
//    String nameSurname = "Mr. "+students.get(0).getNameSurname();
//    students.get(0).setNameSurname(nameSurname);
//    course = course +1+students.get(0).getCourse();
//    students.get(0).setCourse(course);
//
//}

    @After("execution(* getStudents(..))")
    public void afterGetStudentsAdvice(){
        System.out.println("afterThrowingGetStudentsAdvice: была поймана ошибка :) and Finally");
    }

}
