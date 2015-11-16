package com.gmail.mordress.lab3.models;

public class Food implements IGetSet{

    private FoodPossible foodPossible;

    public void setValue(String value) {
        foodPossible = FoodPossible.valueOf(value);
    }

    public String getValue() {
        return foodPossible.toString();
    }

}
