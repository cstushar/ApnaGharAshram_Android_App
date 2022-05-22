package com.example.apnagharashram.Model;

public class Top_donater_rv_model {

    int profileimg ;
    String username , amount ;

    public int getProfileimg() {
        return profileimg;
    }

    public void setProfileimg(int profileimg) {
        this.profileimg = profileimg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Top_donater_rv_model(int profileimg, String username, String amount) {
        this.profileimg = profileimg;
        this.username = username;
        this.amount = amount;
    }
}
