package com.example.codesquad.week1.misson2.mission2_3;

public class Human {

    private String name;
    private int money;

    public Human(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void goToCafe(Cafe cafe) {
        System.out.print(printCafe());
        System.out.println(cafe.print());
    }

    public int getMoney() {
        return money;
    }

    private String printCafe() {
        return name + "는 " +
                money + "원을 가지고 있었고,";
    }
    //James는 5000원을 가지고 있었고, 별다방에서 아메리카노를 마시면서 4000원을 지불했습니다.
    //Tomas는 10000원을 가지고 있었고, 콩다방에서 라떼를 마시면서 5000원을 지불합니다.

}
