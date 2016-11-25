package hello.springboot.example1.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * fuquanemail@gmail.com 2016/11/25 15:10
 * description:
 */
@Component
public class User {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @Value("${remark}")
    private String remark;

    @Value("${user.address}")
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User [");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
