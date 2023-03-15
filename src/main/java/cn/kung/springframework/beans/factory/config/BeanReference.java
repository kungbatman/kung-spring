package cn.kung.springframework.beans.factory.config;

/**
 * @Author kung
 * @Date 2022-06-03
 * Bean的引用
 **/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
