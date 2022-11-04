package com.example.codesquad.week1.misson2.mission2_3;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("제임스", 5000);
        Human human2 = new Human("토마스", 10000);
        Cafe byulCafe = new Cafe("별다방", new Drink("아메리카노", 4000));
        Cafe kongCafe = new Cafe("콩다방", new Drink("라떼", 4000));

        Order order1 = new Order(human1, byulCafe);
        Order order2 = new Order(human2, kongCafe);

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order1.buy());
        System.out.println(order2.buy());
    }
}
