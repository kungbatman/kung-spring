package cn.kung.springframework.beans.factory.support;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.core.io.Resource;
import cn.kung.springframework.core.io.ResourceLoader;

/**
 * @Author kung
 * @Date 2022-06-03
 **/
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
