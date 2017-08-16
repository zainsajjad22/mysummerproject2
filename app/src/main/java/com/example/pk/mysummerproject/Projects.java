package com.example.pk.mysummerproject;

/**
 * Created by pk on 8/15/2017.
 */

import com.google.gson.annotations.SerializedName;

public class Projects {

    @SerializedName("image")
    private String imageUrl;
    @SerializedName("name")
    private String name;
    @SerializedName("city")
    private String city;
    @SerializedName("email")
    private String email;
    @SerializedName("gender")
    private boolean gender;

    public Project(String imageUrl, String name, String city, String email, boolean gender) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.city = city;
        this.email = email;
        this.gender = gender;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
