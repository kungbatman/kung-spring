package cn.kung.springframework.core.covert.support;

import cn.kung.springframework.core.covert.converter.Converter;
import cn.kung.springframework.core.covert.converter.ConverterFactory;
import cn.kung.springframework.util.NumberUtils;
import com.sun.istack.internal.Nullable;

/**
 * Converts from a String any JDK-standard Number implementation.
 * <p>
 * @Author kung
 * @Date 2022-06-27
 **/
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtils.parseNumber(source, this.targetType);
        }
    }

}
