package cn.kung.springframework.beans.factory.config;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @Author kung
 * @Date 2022-06-04
 * <p>
 * Allows for custom modification of an application context's bean definitions,
 * adapting the bean property values of the context's underlying bean factory.
 * <p>
 * 允许自定义修改 BeanDefinition 属性信息
 **/
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修
     * 改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */

    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
