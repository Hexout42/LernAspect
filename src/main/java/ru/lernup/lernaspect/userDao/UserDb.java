package ru.lernup.lernaspect.userDao;

import org.springframework.stereotype.Repository;
import ru.lernup.lernaspect.users.User;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class UserDb {
    private final HashMap<Long,User> allusers =new HashMap<>() ;
    public void addUser(User user){
        allusers.put(user.getId(),user);
    }
    public User getUser(long id){
        return allusers.get(id);
    }

}
