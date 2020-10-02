package ruoxijun.proxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class UserAfter implements AfterReturningAdvice { // 方法执行后接口
    @Override// 参数解析：参1：目标方法返回值，参2：目标方法对象，参3：目标方法参数，参4：目标对象
    public void afterReturning(Object o, Method method, Object[] objects, Object o1)
            throws Throwable {
        System.out.println("AfterReturningAdvice："+o1.getClass().getName()+
                "类"+method.getName()+"方法,返回"+o);
    }
}
