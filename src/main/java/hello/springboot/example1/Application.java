package hello.springboot.example1;


import hello.springboot.example1.listener.MyApplicationEnvironmentPreparedEventListener;
import hello.springboot.example1.listener.MyApplicationFailedEventListener;
import hello.springboot.example1.listener.MyApplicationPreparedEventListener;
import hello.springboot.example1.listener.MyApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * fuquanemail@gmail.com 2016/11/25 12:07
 * description:
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new MyApplicationStartedEventListener());
        app.addListeners(new MyApplicationEnvironmentPreparedEventListener());
        app.addListeners(new MyApplicationPreparedEventListener());
        app.addListeners(new MyApplicationFailedEventListener());
        app.run(args);
    }
}
