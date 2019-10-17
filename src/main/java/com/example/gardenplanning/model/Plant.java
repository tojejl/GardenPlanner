package com.example.gardenplanning.model;


public class Plant {
    private String plantName;
    private String startSeedlingsIndoor;
    private String sowSeedsDirectly;
    private String transplantIndoorSeedlings;
    private String growingPeriod;
    private String harvestPeriod;
    private String plantNotes;
    private String keyword;
    private int id;

    public Plant() {
    }


   public Plant(int id, String plantName, String startSeedlingsIndoor, String sowSeedsDirectly, String transplantIndoorSeedlings, String growingPeriod, String harvestPeriod, String plantNotes, String keyword) {
        this.id = id;
        this.plantName = plantName;
        this.startSeedlingsIndoor = startSeedlingsIndoor;
        this.sowSeedsDirectly = sowSeedsDirectly;
        this.transplantIndoorSeedlings = transplantIndoorSeedlings;
        this.growingPeriod = growingPeriod;
        this.harvestPeriod = harvestPeriod;
        this.plantNotes = plantNotes;
        this.keyword = keyword;

    }

    public Plant (String plantName, String startSeedlingsIndoor, String sowSeedsDirectly, String transplantIndoorSeedlings, String growingPeriod, String harvestPeriod, String plantNotes, String keyword) {
        this.plantName = plantName;
        this.startSeedlingsIndoor = startSeedlingsIndoor;
        this.sowSeedsDirectly = sowSeedsDirectly;
        this.transplantIndoorSeedlings = transplantIndoorSeedlings;
        this.growingPeriod = growingPeriod;
        this.harvestPeriod = harvestPeriod;
        this.plantNotes = plantNotes;
        this.keyword = keyword;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {this.plantName = plantName;}

    public String getStartSeedlingsIndoor() {
        return startSeedlingsIndoor;
    }

    public void setStartSeedlingsIndoor(String startSeedlingsIndoor) {this.startSeedlingsIndoor = startSeedlingsIndoor;}

    public String getSowSeedsDirectly() {
       return sowSeedsDirectly;
    }

    public void setSowSeedsDirectly(String sowSeedsDirectly) {
        this.sowSeedsDirectly = sowSeedsDirectly;
    }

    public String getTransplantIndoorSeedlings() {
        return transplantIndoorSeedlings;
    }

    public void setTransplantIndoorSeedlings(String transplantIndoorSeedlings) {
        this.transplantIndoorSeedlings = transplantIndoorSeedlings;
    }

    public String getGrowingPeriod() {
        return growingPeriod;
    }

    public void setGrowingPeriod(String growingPeriod) {this.growingPeriod = growingPeriod; }

    public String getHarvestPeriod() {
       return harvestPeriod;
    }

    public void setHarvestPeriod(String harvestPeriod) {this.harvestPeriod = harvestPeriod;}

    public String getPlantNotes() {return plantNotes; }

    public void setPlantNotes(String plantNotes) {this.plantNotes = plantNotes;}

    public String getKeyword() {return keyword;}

    public void setKeyword(String keyword) {this.keyword = keyword;}

    public int getId() {
        return id;
    }

    public void setId(int Id) {this.id = id;}

}





