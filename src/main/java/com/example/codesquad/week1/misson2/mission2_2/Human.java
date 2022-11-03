package com.example.codesquad.week1.misson2.mission2_2;

public class Human {

    private boolean isHumanCheck;
    private String name;
    private int age;
    private String gender;
    private boolean maritalStatus;
    private int kid;

    public Human(boolean isHumanCheck, String name, int age, String gender, boolean maritalStatus, int kid) {
        this.isHumanCheck = isHumanCheck;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.kid = kid;
    }

    @Override
    public String toString() {
        return "이름은 " + name + " 이고" +
                "나이는 " + age + " 살 입니다." +
                "성별은 " + gender + " 여성이며, " +
                (maritalStatus ? "기혼자" : "싱글") +
                " 자녀는 " + kid + "명 입니다"
                ;
    }

    public static void main(String[] args) {
        Human human = new Human(true, "제인", 30, "여성",
                true, 1);


        System.out.println(human);
    }
}
