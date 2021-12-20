package com.example.rc_view;

public class Friends {
    private String name;
    private int dob;
    private String city;
    private int id;
    public Friends(int id,String name, int dob, String city) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.city = city;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
