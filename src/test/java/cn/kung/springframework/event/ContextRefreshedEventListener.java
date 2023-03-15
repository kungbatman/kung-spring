package cn.kung.springframework.event;

import cn.kung.springframework.context.ApplicationListener;
import cn.kung.springframework.context.event.ContextRefreshedEvent;

/**
 * @Author kung
 * @Date 2022-06-10
 **/
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }

}