package com.demo.entity;

import java.io.Serializable;

/**
 * @Author: MaoLin
 * @Date: 2019/2/8 16:33
 * @Version 1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 8655851615465363473L;

    private Long id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
