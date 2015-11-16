package com.gmail.mordress.lab3.models;


public class Transport implements IGetSet{

    private TransportPossible transportPossible;

    @Override
    public void setValue(String value) {
        transportPossible = TransportPossible.valueOf(value);
    }

    @Override
    public String getValue() {
        return transportPossible.toString();
    }
}
