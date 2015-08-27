package SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by jzhang on 27/08/2015.
 */
@Aspect
@Component
public class BossAspect {
    @Before("execution(* SpringIoc.Boss.goSomewhere(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is runnizzng!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }
}
