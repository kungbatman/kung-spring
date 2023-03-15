package cn.kung.springframework.aop;

import java.lang.reflect.Method;

/**
 * @Author kung
 * @Date 2022-06-17
 **/
public class UserServiceBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}
