package cn.kung.springframework.common;

import cn.kung.springframework.bean.UserService;
import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author kung
 * @Date 2022-06-04
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
