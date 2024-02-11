package com.example.howmanymoonsdoyouhave;

//This is a modal class. It defines the data structure, the properties and attributes of each item in the list view.
public class Planet {
//    Attributes

    private String planetName;
    private String moonCount;

    private int planetImage;

//    Constructor


    public Planet(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

//    Getters and Setters

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
