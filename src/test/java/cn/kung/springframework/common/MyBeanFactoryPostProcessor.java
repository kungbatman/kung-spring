package cn.kung.springframework.common;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.PropertyValue;
import cn.kung.springframework.beans.PropertyValues;
import cn.kung.springframework.beans.factory.ConfigurableListableBeanFactory;
import cn.kung.springframework.beans.factory.config.BeanDefinition;
import cn.kung.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @Author kung
 * @Date 2022-06-04
 **/
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}