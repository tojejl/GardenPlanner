package com.example.gardenplanning.model;


public class Plant {
    private String name;
    private int id;


    public Plant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Plant(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' + '}';
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
   }

    public void setId(int id) {
        this.id = id;
    }
}



