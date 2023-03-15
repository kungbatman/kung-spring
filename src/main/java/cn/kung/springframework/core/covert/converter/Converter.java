package cn.kung.springframework.core.covert.converter;

/**
 * A converter converts a source object of type {@code S} to a target of type {@code T}.
 * <p>
 * 类型转换处理接口
 *
 * @Author kung
 * @Date 2022-06-27
 **/
public interface Converter<S, T> {
    /** Convert the source object of type {@code S} to target type {@code T}. */
    T convert(S source);
}
