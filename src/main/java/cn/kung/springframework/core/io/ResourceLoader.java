package cn.kung.springframework.core.io;

/**
 * @Author kung
 * @Date 2022-06-03
 * 包装资源加载器
 **/
public interface ResourceLoader {
    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_PERFIX = "classpath:";

    Resource getResource(String location);

}
