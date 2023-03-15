package cn.kung.springframework.context;

import cn.kung.springframework.beans.factory.HierarchicalBeanFactory;
import cn.kung.springframework.beans.factory.ListableBeanFactory;
import cn.kung.springframework.core.io.ResourceLoader;

/**
 * @Author kung
 * @Date 2022-06-04
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 * <p>
 * 应用上下文
 **/
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
