package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspects {
    @Before("aop.aspects.MyPointcut.allAddMethods()")
    public void beforeAddSecurityBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка проверки прав на получение книги/журнала #2222");
        System.out.println("-----------------------------------------");
    }
}
