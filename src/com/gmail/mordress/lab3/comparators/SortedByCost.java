package com.gmail.mordress.lab3.comparators;

import com.gmail.mordress.lab3.models.Voucher;

import java.util.Comparator;

public class SortedByCost implements Comparator<Voucher> {

    @Override
    public int compare(Voucher v1, Voucher v2) {
        if (v1.getCost() > v2.getCost()) {
            return 1;
        } else if (v1.getCost() < v2.getCost()) {
            return -1;
        }
        return 0;
    }
}
