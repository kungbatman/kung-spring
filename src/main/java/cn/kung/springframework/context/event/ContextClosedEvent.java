package cn.kung.springframework.context.event;

/**
 * Event raised when an <code>ApplicationContext</code> gets closed.
 * @Author kung
 * @Date 2022-06-10
 **/
public class ContextClosedEvent extends ApplicationContextEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
