package com.gmail.mordress.lab3.models;


public enum  Transport  {

    BUS("�������"), AIR("�������"), TRAIN("�����"), CAR("����������");

    private String name;

    Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
