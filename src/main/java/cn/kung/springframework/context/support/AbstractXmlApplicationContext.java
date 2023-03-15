package cn.kung.springframework.context.support;

import cn.kung.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.kung.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author kung
 * @Date 2022-06-04
 *
 * Convenient base class for {@link cn.kung.springframework.context.ApplicationContext}
 * implementations, drawing configuration from XML documents containing bean definitions
 * understood by an {@link cn.kung.springframework.beans.factory.xml.XmlBeanDefinitionReader}.
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory){
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
