package com.example.codesquad.week1.misson2.mission2_3;

public class Cafe {
    private String cafeName;
    private String coffee;
    private int price;
    private Human human;
    private int change;

    public Cafe(String cafeName, String coffee, int price, Human human) {
        this.cafeName = cafeName;
        this.coffee = coffee;
        this.price = price;
        this.human = human;
    }

    public int buy() {
        change = human.getMoney() - price;
        return change;
    }

    public String goToCafe() {
        return human.getName() + "는" +
                human.getMoney() + "을 가지고있었다" +
                cafeName + "에서" +
                coffee + "를 마시면서" +
                price + "를 지불했습니다";
    }
}
