package com.example.recnew;
import java.lang.*;
import java.util.*;
public class Task {
    String title,description,date;
    Boolean check;

    public Task(String title, String description, String date, Boolean check) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.check = check;
    }
public Task(){
        check=false;
        date="11/11/2001";
        title="NoTitle yet!";
        description="jhfvbnjmk";
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
