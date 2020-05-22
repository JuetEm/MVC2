package com.mvc.demo.vo;

public class User {

    String email;
    String passwd;
    String name;
    String mobile;

    public User(String email, String passwd, String name, String mobile){
        this.email = email;
        this.passwd = passwd;
        this.name = name;
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
