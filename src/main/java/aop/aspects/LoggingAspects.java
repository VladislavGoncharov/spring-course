package aop.aspects;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspects {


    @Before("aop.aspects.MyPointcut.allAddMethods()")
    public void beforeAddLoggingBookAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book){
                    System.out.println("Название книги: " + ((Book) obj).getName());
                    System.out.println("Автор книги: " + ((Book) obj).getAuthor());
                    System.out.println("Год издания книги: " + ((Book) obj).getYearsOfPublication()+ " год");
                }
                else if (obj instanceof String){
                    System.out.println("Книгу взял читатель по имени " +obj);
                }
            }
        }



        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал #1111");
        System.out.println("-----------------------------------------");
    }





}
