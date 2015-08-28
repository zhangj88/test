package SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by jzhang on 27/08/2015.
 */
@Aspect
@Component
public class BossAspect {
    /*
    Before
     */
//    @Before("execution(* SpringIoc.Boss.goSomewhere(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is runnizzng!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }

    /*
    Pointcut
     */
    @Before("getgoSomewherePointcut()")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(* SpringIoc.Boss.goSomewhere(..))")
    public void getgoSomewherePointcut(){}

    /*
    Around
     */
//    @Around("execution(* SpringIoc.Boss.goSomewhere(..))")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Before invoking getName() method");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After invoking getName() method. Return value="+value);
        return value;
    }

}
