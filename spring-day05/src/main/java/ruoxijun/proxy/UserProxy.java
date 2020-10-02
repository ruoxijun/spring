package ruoxijun.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 标注此类为一个切面
public class UserProxy {
    // @Before定义目标方法执行前的操作
    @Before("execution(* ruoxijun.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("目标方法执行前");
    }
    // @After定义目标方法执行后的操作
    @After("execution(* ruoxijun.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("目标方法执行后");
    }
    // @Around定义目标方法执行时环绕的操作
    @Around("execution(* ruoxijun.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕开始");
        pjp.proceed(); // 让目标开始执行方法
        System.out.println("环绕结束");
    }
}
