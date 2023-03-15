package cn.kung.springframework.beans.factory.support;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @Author kung
 * @Date 2022-06-02
 * <p>
 *     Bean 实例化策略
 * </p>
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
