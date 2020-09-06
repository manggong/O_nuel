package com.example.onuel.domain;

public class Restaurant {

    private final String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(String name, String location) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return "";
    }
}
