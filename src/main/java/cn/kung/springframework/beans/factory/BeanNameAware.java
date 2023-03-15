package cn.kung.springframework.beans.factory;

/**
 * Interface to be implemented by beans that want to be aware of their bean name in
 * a bean factory.
 * <p>
 * 实现此接口，既能感知到所属的 BeanName
 *
 * @Author kung
 * @Date 2022-06-05
 **/
public interface BeanNameAware extends Aware {

    void setBeanName(String name);
}
