package com.smuTree.Back_main.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class User {
    //key user_id, username, email, highscore, highscore_time

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private Integer highscore;

    @Column
    private Timestamp highscore_time;

    @Enumerated(EnumType.STRING)
    @Column
    private Provider provider; //소셜 서비스 (네이버, 카카오...)

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

}
