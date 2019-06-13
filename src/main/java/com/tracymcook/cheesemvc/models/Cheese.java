// will represent the data in the application

package com.tracymcook.cheesemvc.models;

public class Cheese {

    private String name;
    private String description;
    private int cheeseId;
    private static int nextId = 1;


    // can auto-generate code by right-clicking --> generate --> constructor
    public Cheese(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public Cheese () { //this is a "no arg" constructor"
        cheeseId = nextId;
        nextId++;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    // can auto-generate code by right-clicking --> generate --> getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
