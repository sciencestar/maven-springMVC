package com.entity;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/17
 * @Version V1.0
 **/
public class User implements Serializable{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
