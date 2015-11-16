package com.gmail.mordress.lab3.models;

public class Inclusive implements IGetSet{

    private InclusivePossible inclusivePossible;

    @Override
    public void setValue(String value) {
        inclusivePossible = InclusivePossible.valueOf(value);
    }

    @Override
    public String getValue() {
        return inclusivePossible.toString();
    }
}
