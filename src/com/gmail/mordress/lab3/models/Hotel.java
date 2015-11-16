package com.gmail.mordress.lab3.models;

public class Hotel {

    private Integer stars;

    private Inclusive inclusive;

    private Boolean oneHumanRooms;

    private Boolean twoHumanRooms;

    private Boolean threeHumanRooms;

    private Food food;

    private Boolean tv;

    private Boolean wiFi;

    private Boolean conditioner;

    private Boolean refrigerator;

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Inclusive getInclusive() {
        return inclusive;
    }

    public void setInclusive(Inclusive inclusive) {
        this.inclusive = inclusive;
    }

    public Boolean getOneHumanRooms() {
        return oneHumanRooms;
    }

    public void setOneHumanRooms(Boolean oneHumanRooms) {
        this.oneHumanRooms = oneHumanRooms;
    }

    public Boolean getTwoHumanRooms() {
        return twoHumanRooms;
    }

    public void setTwoHumanRooms(Boolean twoHumanRooms) {
        this.twoHumanRooms = twoHumanRooms;
    }

    public Boolean getThreeHumanRooms() {
        return threeHumanRooms;
    }

    public void setThreeHumanRooms(Boolean threeHumanRooms) {
        this.threeHumanRooms = threeHumanRooms;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Boolean getTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
    }

    public Boolean getWiFi() {
        return wiFi;
    }

    public void setWiFi(Boolean wiFi) {
        this.wiFi = wiFi;
    }

    public Boolean getConditioner() {
        return conditioner;
    }

    public void setConditioner(Boolean conditioner) {
        this.conditioner = conditioner;
    }

    public Boolean getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Boolean refrigerator) {
        this.refrigerator = refrigerator;
    }
}
