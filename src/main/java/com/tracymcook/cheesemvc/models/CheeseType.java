package com.tracymcook.cheesemvc.models;

public enum CheeseType {

    // convention is for these to be all-caps

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake");

    private final String name;

    CheeseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
