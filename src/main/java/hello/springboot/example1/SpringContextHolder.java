package hello.springboot.example1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * fuquanemail@gmail.com 2016/11/25 15:16
 * description:
 */
@Component("springContextHolder")
public class SpringContextHolder implements ApplicationContextAware {

    public static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.err.println("ApplicationContextAware setApplicationContext");
        context = applicationContext;
    }
}
