package com.sucaiji.twtich.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User {
    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private Integer userId;

    public User() {
    }

    public User(String username, String password, Integer userId) {
        this.username = username;
        this.password = password;
        this.userId = userId;
    }
}
