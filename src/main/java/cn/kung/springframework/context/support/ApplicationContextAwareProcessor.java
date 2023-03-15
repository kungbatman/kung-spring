package cn.kung.springframework.context.support;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.factory.config.BeanPostProcessor;
import cn.kung.springframework.context.ApplicationContext;
import cn.kung.springframework.context.ApplicationContextAware;

/**
 * @Author kung
 * @Date 2022-06-05
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware)
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
