package cn.kung.springframework.aop;

/**
 * Filter that restricts matching of a pointcut or introduction to
 * a given set of target classes.
 *
 * @Author kung
 * @Date 2022-06-14
 *
 * 匹配类，用于切点找到给定的接口和目标类
 **/
public interface ClassFilter {
    /**
     * Should the pointcut apply to the given interface or target class?
     * @param clazz the candidate target class
     * @return whether the advice should apply to the given target class
     */
    boolean matches(Class<?> clazz);
}
