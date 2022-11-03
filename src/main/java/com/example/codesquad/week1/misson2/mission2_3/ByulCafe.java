package com.example.codesquad.week1.misson2.mission2_3;

public class ByulCafe implements Cafe {

    private String cafeName;
    private String coffee;
    private int price;

    public ByulCafe(String cafeName, String coffee, int price) {
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
    //James는 5000원을 가지고 있었고, 별다방에서 아메리카노를 마시면서 4000원을 지불했습니다.
    //Tomas는 10000원을 가지고 있었고, 콩다방에서 라떼를 마시면서 5000원을 지불합니다.
}
