package cn.kung.springframework.beans;

/**
 * @Author kung
 * @Date 2022-06-01
 **/
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}