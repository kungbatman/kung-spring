package cn.kung.springframework.event;

import cn.kung.springframework.context.ApplicationListener;

import java.util.Date;

/**
 * @Author kung
 * @Date 2022-06-10
 **/
public class CustomEventListener implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }

}
