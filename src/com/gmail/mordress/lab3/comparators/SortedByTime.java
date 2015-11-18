package com.gmail.mordress.lab3.comparators;

import com.gmail.mordress.lab3.models.Voucher;

import java.util.Comparator;

public class SortedByTime implements Comparator<Voucher> {

    @Override
    public int compare(Voucher v1, Voucher v2) {
        if (v1.getNumberOfDays() + v1.getNumberOfNights() > v2.getNumberOfDays() + v2.getNumberOfNights()) {
            return 1;
        } else if (v1.getNumberOfDays() + v1.getNumberOfNights() < v2.getNumberOfDays() + v2.getNumberOfNights()) {
            return -1;
        }
        return 0;
    }
}
