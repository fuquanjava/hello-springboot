package hello.springboot.example1.controller;

import hello.springboot.example1.SpringContextHolder;
import hello.springboot.example1.domain.User;
import hello.springboot.example1.domain.User2;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * fuquanemail@gmail.com 2016/11/25 12:42
 * description:
 */
@RestController
@RequestMapping("/example1")
public class HelloController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        User user = SpringContextHolder.context.getBean(User.class);
        User2 user2 = SpringContextHolder.context.getBean(User2.class);
        //App app = SpringContextHolder.context.getBean(App.class);

        return  "Hello " + user + "," + user2;
    }
}
