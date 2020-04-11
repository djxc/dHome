package com.djxc.dhome.entity;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;
    private Date register_date;
    private int authority;

    public User() {}

    public User(int id, String name, String password, String email, Date register_date, int authority) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.register_date = register_date;
        this.authority = authority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }
}
