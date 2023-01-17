package ru.lernup.lernaspect.users;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
public class UserBuilder {
    private  String name;
    private  int age;
    private   long id;
    private   float weight;
    private   float hight;
    public  UserBuilder whithName(String name){
        this.name = name;
        return this;
    }
    public  UserBuilder whithAge(int age){
        this.age = age;
        return  this;
    }
    public  UserBuilder whithId(long id){
        this.id= id;
        return this;
    }
    public UserBuilder whithWeight(float weight){
        this.weight = weight;
        return  this;
    }
    public UserBuilder whithHight(float hight){
        this.hight = hight;
        return this;
    }
    public User build(){
        return new User(name,age,id,weight,hight);
    }

}
