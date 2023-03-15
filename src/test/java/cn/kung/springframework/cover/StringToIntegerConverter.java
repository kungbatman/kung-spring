package cn.kung.springframework.cover;

import cn.kung.springframework.core.covert.converter.Converter;

/**
 * @Author kung
 * @Date 2022-06-27
 **/
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }

}
