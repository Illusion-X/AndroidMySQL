package com.example.test1;

import java.io.Serializable;

public class User implements Serializable
{

    private int id;
    private String username, email, gender;

    public User(int id, String username, String email, String gender)
    {
        this.id = id;
        this.username = username;
        this.email = email;
        this.gender = gender;
    }

    public int getId()
    {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public String getEmail()
    {
        return email;
    }

    public String getGender()
    {
        return gender;
    }
}