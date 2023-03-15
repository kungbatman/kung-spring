package cn.kung.springframework.context;

import cn.kung.springframework.beans.BeansException;
import cn.kung.springframework.beans.factory.Aware;

/**
 * Interface to be implemented by any object that wishes to be notifiedof the {@link ApplicationContext} that it runs in.
 * <p>
 * 实现此接口，既能感知到所属的 ApplicationContext
 *
 * @Author kung
 * @Date 2022-06-05
 **/
public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
