package cn.kung.springframework.context.annotation;

import java.lang.annotation.*;

/**
 * @Author kung
 * @Date 2022-06-23
 * <p>
 * 用于配置作用域的自定义注解，方便通过配置 Bean 对象注解的时候，拿到 Bean
 * 对象的作用域
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {
    String value() default "singleton";
}
