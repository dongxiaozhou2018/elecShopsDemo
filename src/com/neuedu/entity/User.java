package com.neuedu.entity;

import java.io.Serializable;

public class User implements Serializable {

    public User() {

    }

    private Integer userId;

    private String userName;

    private String userPsw;

    private String userEmail;

    private String userTelPhone;

    private String userRegDate;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPsw='" + userPsw + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userTelPhone='" + userTelPhone + '\'' +
                ", userRegDate='" + userRegDate + '\'' +
                '}';
    }

    public User(Integer userId, String userName, String userPsw, String userEmail, String userTelPhone, String userRegDate) {
        this.userId = userId;
        this.userName = userName;
        this.userPsw = userPsw;
        this.userEmail = userEmail;
        this.userTelPhone = userTelPhone;
        this.userRegDate = userRegDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTelPhone() {
        return userTelPhone;
    }

    public void setUserTelPhone(String userTelPhone) {
        this.userTelPhone = userTelPhone;
    }

    public String getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(String userRegDate) {
        this.userRegDate = userRegDate;
    }
}
