package hello.springboot.example1.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * fuquanemail@gmail.com 2016/11/25 13:18
 * description:
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent startedEvent) {
        System.err.println("ApplicationStartedEvent startedEvent");
    }
}
