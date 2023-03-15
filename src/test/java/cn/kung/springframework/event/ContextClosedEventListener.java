package cn.kung.springframework.event;

import cn.kung.springframework.context.ApplicationListener;
import cn.kung.springframework.context.event.ContextClosedEvent;

/**
 * @Author kung
 * @Date 2022-06-10
 **/
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }

}
