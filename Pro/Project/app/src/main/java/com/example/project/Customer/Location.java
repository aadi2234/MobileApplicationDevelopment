package com.example.project.Customer;

public class Location {
    String name,contact,location,imup,Id;

    public Location(String name, String contact, String location, String imup, String id) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.imup = imup;
        this.Id = id;
    }

    public Location() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImup() {
        return imup;
    }

    public void setImup(String imup) {
        this.imup = imup;
    }
}
