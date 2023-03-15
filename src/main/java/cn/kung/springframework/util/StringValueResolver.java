package cn.kung.springframework.util;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link cn.kung.springframework.beans.factory.config.ConfigurableBeanFactory}.
 * <p>
 *
 * @Author kung
 * @Date 2022-06-25
 * 解析字符串操作的接口
 **/
public interface StringValueResolver {

    String resolveStringValue(String strVal);
}
