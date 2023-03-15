package cn.kung.springframework.aop;

import java.lang.reflect.Method;

/**
 * Part of a {@link Pointcut}: Checks whether the target method is eligible for advice.
 *
 * @Author kung
 * @Date 2022-06-14
 * <p>
 * 方法匹配，找到表达式范围内匹配下的目标类和方法
 **/
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     *
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);
}
