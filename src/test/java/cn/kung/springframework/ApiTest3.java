package cn.kung.springframework;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.factory.config.BeanPostProcessor;
import cn.kung.springframework.context.support.ClassPathXmlApplicationContext;
import cn.kung.springframework.scan.IUserService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author kung
 * @Date 2022-06-23
 **/
public class ApiTest3 {
    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

    @Test
    public void test_property() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService);
    }

    @Test
    public void test_beanPost() {

        BeanPostProcessor beanPostProcessor = new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }
        };

        List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.remove(beanPostProcessor);

        System.out.println(beanPostProcessors.size());
    }

    @Test
    public void test_scan_annotation() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        cn.kung.springframework.bean_2.IUserService userService = applicationContext.getBean("userService", cn.kung.springframework.bean_2.IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

    @Test
    public void test_autoProxy() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springAop.xml");
        cn.kung.springframework.aop.IUserService userService = applicationContext.getBean("userService", cn.kung.springframework.aop.IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

}
