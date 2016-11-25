package com.example.putuguna.swipelayout.models;

import java.io.Serializable;

/**
 * Created by putuguna on 23/06/16.
 */
public class StudentModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String emailId;

    public StudentModel() {
    }

    public StudentModel(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
