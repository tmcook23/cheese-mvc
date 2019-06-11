// will represent the data in the application

package com.tracymcook.cheesemvc.models;

public class Cheese {

    private String name;
    private String description;


    // can auto-generate code by right-clicking --> generate --> constructor
    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
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
