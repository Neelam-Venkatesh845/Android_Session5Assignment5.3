package com.connect.s5a3.model;

/**
 * Created by win7 on 28-09-2016.
 */

public class Student {
    String name;
    String phone;

    public Student() {
    }

    public Student(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
