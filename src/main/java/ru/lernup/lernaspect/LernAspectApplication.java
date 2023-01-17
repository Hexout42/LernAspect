package ru.lernup.lernaspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.lernup.lernaspect.services.UserService;

@SpringBootApplication
public class LernAspectApplication {

    public static void main(String[] args) {
         long x=1;
        ApplicationContext context =SpringApplication.run(LernAspectApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        userService.addUser("Ivan",22,x++,98.6F,175.4F);
        userService.addUser("Andey",27, x++,90.6F,185.4F);
        userService.addUser("Stepan",24,x++,68.6F,170.9F);
        userService.addUser("Stanislav",42,x++,78.6F,174.0F);
        userService.getUser(2L);
        userService.getUser(4L);

    }

}
