package com.algorist.User.Vo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;

    private String user_id;
    private String password;
    private String name;
    private int phone_num;
    private String user_sts;
    private Date join_date;
    private Date del_date;
    private String privacy_yn;

}
