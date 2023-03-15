package cn.kung.springframework.aop;

/**
 * @Author kung
 * @Date 2022-06-14
 **/
public interface IUserService {
    String queryUserInfo();

    String register(String userName);
}
