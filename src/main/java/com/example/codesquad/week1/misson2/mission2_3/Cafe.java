package com.example.codesquad.week1.misson2.mission2_3;

public class Cafe {
    private String cafeName;
    Drink drink;

    public Cafe(String cafeName, Drink drink) {
        this.drink = drink;
        this.cafeName = cafeName;
    }

    public String getCafeName() {
        return cafeName;
    }
}

