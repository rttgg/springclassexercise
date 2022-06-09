package com.thymeleaf.register.models;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    String name;
    String email;
    String password;
    String gender;
    String note;
    boolean married;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date birthday;
    String profession;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public User(String name, String email, String password, String gender, String note, boolean married, Date birthday, String profession) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.note = note;
        this.married = married;
        this.birthday = birthday;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", note='" + note + '\'' +
                ", married=" + married +
                ", birthday=" + birthday +
                ", profession='" + profession + '\'' +
                '}';
    }
}
