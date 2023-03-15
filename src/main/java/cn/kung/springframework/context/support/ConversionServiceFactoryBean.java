package cn.kung.springframework.context.support;

import cn.kung.springframework.beans.factory.FactoryBean;
import cn.kung.springframework.beans.factory.InitializingBean;
import cn.kung.springframework.core.covert.ConversionService;
import cn.kung.springframework.core.covert.converter.Converter;
import cn.kung.springframework.core.covert.converter.ConverterFactory;
import cn.kung.springframework.core.covert.converter.ConverterRegistry;
import cn.kung.springframework.core.covert.converter.GenericConverter;
import cn.kung.springframework.core.covert.support.DefaultConversionService;
import cn.kung.springframework.core.covert.support.GenericConversionService;
import com.sun.istack.internal.Nullable;

import java.util.Set;

/**
 * A factory providing convenient access to a ConversionService configured with
 * converters appropriate for most environments. Set the
 * setConverters "converters" property to supplement the default converters.
 * <p>
 * 提供创建 ConversionService 工厂
 *
 * @Author kung
 * @Date 2022-06-27
 **/
public class ConversionServiceFactoryBean implements FactoryBean<ConversionService>, InitializingBean {

    @Nullable
    private Set<?> converters;

    @Nullable
    private GenericConversionService conversionService;

    @Override
    public ConversionService getObject() throws Exception {
        return conversionService;
    }

    @Override
    public Class<?> getObjectType() {
        return conversionService.getClass();
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.conversionService = new DefaultConversionService();
        registerConverters(converters, conversionService);
    }

    private void registerConverters(Set<?> converters, ConverterRegistry registry) {
        if (converters != null) {
            for (Object converter : converters) {
                if (converter instanceof GenericConverter) {
                    registry.addConverter((GenericConverter) converter);
                } else if (converter instanceof Converter<?, ?>) {
                    registry.addConverter((Converter<?, ?>) converter);
                } else if (converter instanceof ConverterFactory<?, ?>) {
                    registry.addConverterFactory((ConverterFactory<?, ?>) converter);
                } else {
                    throw new IllegalArgumentException("Each converter object must implement one of the " +
                            "Converter, ConverterFactory, or GenericConverter interfaces");
                }
            }
        }
    }

    public void setConverters(Set<?> converters) {
        this.converters = converters;
    }
}
