package hello.springboot.example1.domain;

import org.springframework.beans.factory.annotation.Value;


/**
 * fuquanemail@gmail.com 2016/11/25 15:40
 * description:
 */

public class App {

    @Value("${app.env}")
    private String appEnv;


    public String getAppEnv() {
        return appEnv;
    }

    public void setAppEnv(String appEnv) {
        this.appEnv = appEnv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("App [");
        sb.append("appEnv='").append(appEnv).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
