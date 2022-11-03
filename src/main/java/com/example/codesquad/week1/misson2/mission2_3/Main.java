package com.example.codesquad.week1.misson2.mission2_3;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("제임스", 5000);
        Human human2 = new Human("토마스", 10000);

        //James는 5000원을 가지고 있었고, 별다방에서 아메리카노를 마시면서 4000원을 지불했습니다.
        //Tomas는 10000원을 가지고 있었고, 콩다방에서 라떼를 마시면서 5000원을 지불합니다.

        Cafe byulCafe = new ByulCafe("별다방", "아메리카노", 4000);
        Cafe kongCafe = new KongCafe("콩다방", "라떼", 5000);

        human1.goToCafe(byulCafe);
        human2.goToCafe(kongCafe);

        System.out.println(" 남은그액은 제임스= " + byulCafe.buy(human1.getMoney()));
        System.out.println(" 남은그액은 토마스= " + kongCafe.buy(human2.getMoney()));
    }
}
