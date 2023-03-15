package cn.kung.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author kung
 * @Date 2022-06-03
 **/
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod() {
        System.out.println("执行：init-method");
        hashMap.put("10001", "彦飞大佬");
        hashMap.put("10002", "漩涡鸣人");
        hashMap.put("10003", "马自达");
    }

    public void destroyDataMethod(){
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
