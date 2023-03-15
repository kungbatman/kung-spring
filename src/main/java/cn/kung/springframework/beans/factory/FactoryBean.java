package cn.kung.springframework.beans.factory;

/**
 * Interface to be implemented by objects used within a {@link BeanFactory}
 * which are themselves factories. If a bean implements this interface,
 * it is used as a factory for an object to expose, not directly as a bean
 * instance that will be exposed itself.
 *
 * @param <T>
 * @Author kung
 * @Date 2022-06-08
 **/
public interface FactoryBean<T> {

    T getObject() throws Exception; // 获取对象

    Class<?> getObjectType(); // 对象类型

    boolean isSingleton(); // 是否是单例对象
}
