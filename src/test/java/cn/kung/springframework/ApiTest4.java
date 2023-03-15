package cn.kung.springframework;

import cn.kung.springframework.context.support.ClassPathXmlApplicationContext;
import cn.kung.springframework.convertBean.Husband;
import cn.kung.springframework.core.covert.converter.Converter;
import cn.kung.springframework.core.covert.support.StringToNumberConverterFactory;
import cn.kung.springframework.cover.StringToIntegerConverter;
import cn.kung.springframework.dependency.Wife;
import org.junit.Test;

/**
 * @Author kung
 * @Date 2022-06-26
 **/
public class ApiTest4 {
//    @Test
//    public void test_circular() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-proxy.xml");
//        Husband husband = applicationContext.getBean("husband", Husband.class);
//        Wife wife = applicationContext.getBean("wife", Wife.class);
//        System.out.println("老公的媳妇：" + husband.queryWife());
//        System.out.println("媳妇的老公：" + wife.queryHusband());
//    }

    @Test
    public void test_convert() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-convert.xml");
        cn.kung.springframework.convertBean.Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println("测试结果：" + husband);
    }

    @Test
    public void test_StringToIntegerConverter() {
        StringToIntegerConverter converter = new StringToIntegerConverter();
        Integer num = converter.convert("1234");
        System.out.println("测试结果：" + num);
    }

    @Test
    public void test_StringToNumberConverterFactory() {
        StringToNumberConverterFactory converterFactory = new StringToNumberConverterFactory();
        Converter<String, Integer> stringToIntegerConverter = converterFactory.getConverter(Integer.class);
        System.out.println("测试结果：" + stringToIntegerConverter.convert("1234"));
        Converter<String, Long> stringToLongConverter = converterFactory.getConverter(Long.class);
        System.out.println("测试结果：" + stringToLongConverter.convert("1234"));
    }
}
