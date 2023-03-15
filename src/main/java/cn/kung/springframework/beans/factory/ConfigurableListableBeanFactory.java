package cn.kung.springframework.beans.factory;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.factory.config.AutowireCapableBeanFactory;
import cn.kung.springframework.beans.factory.config.BeanDefinition;
import cn.kung.springframework.beans.factory.config.BeanPostProcessor;
import cn.kung.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author kung
 * @Date 2022-06-03
 * <p>
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link cn.kung.springframework.beans.factory.config.ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}