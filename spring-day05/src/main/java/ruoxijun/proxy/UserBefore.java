package ruoxijun.proxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class UserBefore implements MethodBeforeAdvice { // 方法执行前接口
    @Override // 参数解析：参1：目标方法对象，参2：目标方法参数，参3：目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("MethodBeforeAdvice："+o.getClass().getName()+
                "类"+method.getName()+"方法");
    }
}
