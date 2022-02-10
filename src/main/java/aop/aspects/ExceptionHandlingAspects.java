package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionHandlingAspects {
    @Before("aop.aspects.MyPointcut.allAddMethods()")
    public void beforeAddExceptionBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить исключение при получении книги/журнала #3333");
        System.out.println("-----------------------------------------");
    }
}
