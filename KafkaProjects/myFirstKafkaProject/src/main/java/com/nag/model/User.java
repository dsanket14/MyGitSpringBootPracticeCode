package com.nag.model;

public class User {

    private int userId;
    private  String userName;
    private long userMb;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserMb() {
        return userMb;
    }

    public void setUserMb(long userMb) {
        this.userMb = userMb;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userMb=" + userMb +
                '}';
    }
}
