package com.benjamin.domain;

/**
 * Created by index on 09.08.2015.
 */
public class UserDO {

    private String login;
    private String email;
    private String password;
    private UserDO master;
    private UserInfoDO info;
    private UserPhone userPhone;

    public UserDO() {
    }

    public UserDO(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDO getMaster() {
        return master;
    }

    public void setMaster(UserDO master) {
        this.master = master;
    }

    public UserInfoDO getInfo() {
        return info;
    }

    public void setInfo(UserInfoDO info) {
        this.info = info;
    }

    public UserPhone getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(UserPhone userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", master=" + master +
                ", info=" + info +
                ", userPhone=" + userPhone +
                '}';
    }
}
