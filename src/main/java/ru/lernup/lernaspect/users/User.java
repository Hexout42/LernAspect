package ru.lernup.lernaspect.users;

import lombok.Data;


@Data

public class User {
    private String name;
    private  int age;
    private   long id;
    private   float weight;
    private   float hight;
    public User(String name,int age,long id,float weight,float hight){
        this.name= name;
        this.age = age;
        this.id = id;
        this.weight = weight;
        this.hight = hight;
    }

}
