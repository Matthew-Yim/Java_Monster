package com.teksystem.models;

public abstract class Monster {

    // Fields
    private String name;
    // Fields


    // Constructor
    public Monster(String name) {
        this.name = name;
    } // Constructor


    // Methods
    public abstract String attack();
    // Methods


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Getters and Setters

} // Class
