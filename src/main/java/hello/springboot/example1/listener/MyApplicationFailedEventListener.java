package hello.springboot.example1.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * fuquanemail@gmail.com 2016/11/25 14:33
 * description:
 */
public class MyApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent failedEvent) {
        Throwable throwable = failedEvent.getException();
        handleThrowable(throwable);

    }

    /*处理异常*/
    private void handleThrowable(Throwable throwable) {
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.err.println("ApplicationFailedEvent failedEvent.");
            }
        });
    }
}
