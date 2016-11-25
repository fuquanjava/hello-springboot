package hello.springboot.example1.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * fuquanemail@gmail.com 2016/11/25 15:31
 *
 * 在spring boot中是可以省去 @Value注解。
 *
 * 支持 实体嵌套配置。
 *
 */
@Component
@ConfigurationProperties(prefix = "user2")
public class User2 {

    private String name;

    private int age;

    private String remark;

    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User2 [");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
