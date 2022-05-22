package com.example.apnagharashram.Model;

public class Recently_donated_rv_model {

    int user_profile_pic;
    String Donation_type , Donater_name , Donation_date ;

    public int getUser_profile_pic() {
        return user_profile_pic;
    }

    public void setUser_profile_pic(int user_profile_pic) {
        this.user_profile_pic = user_profile_pic;
    }

    public String getDonation_type() {
        return Donation_type;
    }

    public void setDonation_type(String donation_type) {
        Donation_type = donation_type;
    }

    public String getDonater_name() {
        return Donater_name;
    }

    public void setDonater_name(String donater_name) {
        Donater_name = donater_name;
    }

    public String getDonation_date() {
        return Donation_date;
    }

    public void setDonation_date(String donation_date) {
        Donation_date = donation_date;
    }

    public Recently_donated_rv_model(int user_profile_pic, String donation_type, String donater_name, String donation_date) {
        this.user_profile_pic = user_profile_pic;
        Donation_type = donation_type;
        Donater_name = donater_name;
        Donation_date = donation_date;
    }
}
