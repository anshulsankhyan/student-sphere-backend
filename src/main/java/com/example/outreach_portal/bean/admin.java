package com.example.outreach_portal.bean;



import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "admin")
public class admin {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String username;

    String password;

}
