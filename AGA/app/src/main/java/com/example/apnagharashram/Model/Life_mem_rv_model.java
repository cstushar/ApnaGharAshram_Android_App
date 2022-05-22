package com.example.apnagharashram.Model;

public class Life_mem_rv_model {

    int profile_img;
    String username,userphoneno , userbusiness;

    public Life_mem_rv_model(int profile_img, String username, String userphoneno, String userbusiness) {
        this.profile_img = profile_img;
        this.username = username;
        this.userphoneno = userphoneno;
        this.userbusiness = userbusiness;
    }

    public int getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(int profile_img) {
        this.profile_img = profile_img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserphoneno() {
        return userphoneno;
    }

    public void setUserphoneno(String userphoneno) {
        this.userphoneno = userphoneno;
    }

    public String getUserbusiness() {
        return userbusiness;
    }

    public void setUserbusiness(String userbusiness) {
        this.userbusiness = userbusiness;
    }
}
