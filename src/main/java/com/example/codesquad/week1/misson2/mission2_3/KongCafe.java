package com.example.codesquad.week1.misson2.mission2_3;

public class KongCafe implements Cafe {

    private String cafeName;
    private String coffee;
    private int price;

    public KongCafe(String cafeName, String coffee, int price) {
        this.cafeName = cafeName;
        this.coffee = coffee;
        this.price = price;
    }

    @Override
    public int buy(int money) {
        money -= price;
        return money;
    }

    @Override
    public String print() {
        return cafeName + "에서" +
                coffee + "를 마시면서" +
                price + "를 지불했습니다";
    }
}
