package ru.lernup.lernaspect.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.lernup.lernaspect.annotation.LogMethod;
import ru.lernup.lernaspect.annotation.WorkTime;
import ru.lernup.lernaspect.userDao.UserDb;
import ru.lernup.lernaspect.users.User;
import ru.lernup.lernaspect.users.UserBuilder;
@Slf4j
@Service
public class UserService {
private final UserBuilder userBuilder;
private final UserDb userDb;

    public UserService(UserBuilder userBuilder, UserDb userDb) {
        this.userBuilder = userBuilder;
        this.userDb = userDb;
    }

 @WorkTime
    public void addUser(String name,int age,long id,float weight,float hight){
        userBuilder.whithName(name);
        userBuilder.whithAge(age);
        userBuilder.whithId(id);
        userBuilder.whithWeight(weight);
        userBuilder.whithHight(hight);
        userDb.addUser(userBuilder.build());
    }
    @LogMethod
    public User getUser(long id){
        log.info(userDb.getUser(id).toString());
        return userDb.getUser(id);
    }

}
