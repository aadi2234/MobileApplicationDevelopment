package com.example.project.Customer;

import java.util.ArrayList;

public class List {
   String image,name,id;
 //  ArrayList<String> list=new ArrayList<>();


    public List() {
    }

    public List(String image, String name, String id) {
        this.image = image;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
