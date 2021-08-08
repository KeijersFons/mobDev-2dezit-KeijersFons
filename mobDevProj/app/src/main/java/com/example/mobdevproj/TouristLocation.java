package com.example.mobdevproj;

public class TouristLocation {
    private String name;
    private String address;
    private String type; //museum, monument, art gallery, hotels, etc
    private double rating;


    public TouristLocation(String name, String address,String type, double rating){
        this.name = name;
        this.address = address;
        this.type = type;
        this.rating = rating;
    }
}
