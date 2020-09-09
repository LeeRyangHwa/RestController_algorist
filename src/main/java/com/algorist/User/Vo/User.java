package com.algorist.User.Vo;

import lombok.*;


@Getter
@Setter
public class User{
    private String userid;
    private String password;
    private String name;

    @Builder
    public User(String userid, String password, String name){
        this.userid = userid;
        this.password = password;
        this.name = name;

    }
}
