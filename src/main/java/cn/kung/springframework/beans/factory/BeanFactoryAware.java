package cn.kung.springframework.beans.factory;

import cn.kung.springframework.beans.BeansException;

/**
 * Interface to be implemented by beans that wish to be aware of their
 * owning {@link BeanFactory}.
 * <p>
 * 实现此接口，既能感知到所属的 BeanFactory
 *
 * @Author kung
 * @Date 2022-06-05
 **/
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
