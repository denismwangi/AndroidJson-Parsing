package com.example.jsonp;



public class Saccos {


    private  String name;
    private  String description;


    public Saccos(String name, String description) {
        this.name = name;
        this.description = description;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
