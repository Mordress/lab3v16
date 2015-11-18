package com.gmail.mordress.lab3.models;


public enum  Transport  {

    BUS("Автобус"), AIR("Самолет"), TRAIN("Поезд"), CAR("Автомобиль");

    private String name;

    Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
