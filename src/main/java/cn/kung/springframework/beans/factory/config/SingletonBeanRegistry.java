package cn.kung.springframework.beans.factory.config;

/**
 * @Author kung
 * @Date 2022-06-01
 * 单例注册接口定义
 **/
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}
