package com.gmail.mordress.lab3.models;

public class Type implements IGetSet{

    private TypePossible typePossible;

    @Override
    public void setValue(String value) {
        typePossible = TypePossible.valueOf(value);
    }

    @Override
    public String getValue() {
        return typePossible.toString();
    }
}
