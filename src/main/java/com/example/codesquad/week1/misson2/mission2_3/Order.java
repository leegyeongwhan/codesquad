package com.example.codesquad.week1.misson2.mission2_3;

public class Order {
    private Human human;
    private Cafe cafe;
    private int change;

    public Order(Human human, Cafe cafe) {
        this.human = human;
        this.cafe = cafe;
    }

    public int buy() {
        change = human.getMoney() - cafe.drink.getPrice();
        return change;
    }

    @Override
    public String toString() {
        return human.getName() + "는" +
                human.getMoney() + "원을 가지고 있었고, " +
                cafe.getCafeName() + "에서 " +
                cafe.drink.getCoffee() + "를 마시면서 " +
                cafe.drink.getPrice() + " 을 지불했습니다.";
    }
}
