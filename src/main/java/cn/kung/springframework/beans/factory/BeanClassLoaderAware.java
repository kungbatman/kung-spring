package cn.kung.springframework.beans.factory;

/**
 * Callback that allows a bean to be aware of the bean{@link ClassLoader class loader};
 * that is, the class loader used by the present bean factory to load bean classes.
 * <p>
 * 实现此接口，既能感知到所属的 ClassLoader
 *
 * @Author kung
 * @Date 2022-06-05
 **/
public interface BeanClassLoaderAware extends Aware {

    void setBeanClassLoader(ClassLoader classLoader);
}