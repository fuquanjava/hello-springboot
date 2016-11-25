package hello.springboot.example1.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * fuquanemail@gmail.com 2016/11/25 14:27
 * description:
 */

/**
 * 在该监听器中是无法获取自定义bean并进行操作的。
 */
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent preparedEvent) {
        ConfigurableApplicationContext context = preparedEvent.getApplicationContext();
        System.err.println("ApplicationPreparedEvent context," + context);
    }
}
