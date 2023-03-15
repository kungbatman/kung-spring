package cn.kung.springframework.context.annotation;

import cn.hutool.core.util.ClassUtil;
import cn.kung.springframework.beans.factory.config.BeanDefinition;
import cn.kung.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A component provider that scans the classpath from a base package. It then
 * applies exclude and include filters to the resulting classes to find candidates.
 * <p>
 *
 * @Author kung
 * @Date 2022-06-23
 * <p>
 * 处理对象扫描装配
 **/
public class ClassPathScanningCandidateComponentProvider {

    public Set<BeanDefinition> findCanidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}
