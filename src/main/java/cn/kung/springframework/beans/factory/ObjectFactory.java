package cn.kung.springframework.beans.factory;

import cn.kung.springframework.beans.BeansException;

/**
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 * @Author kung
 * @Date 2022-06-26
 **/
public interface ObjectFactory<T> {
    T getObject() throws BeansException;
}
