package com.example.codesquad.week1.misson2.mission2_4;

public class MyDate {
    static int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isValid() {
        if (1700 <= year) {
            if (!monthValidation()) {
                return false;
            }
            if (month == 2 && day == 29) {
                if (leapValidation()) {
                    return true;
                }
            }
            if (!dayValid()) {
                return false;
            }
            return true;
        }


        return true;
    }

    private boolean dayValid() {
        if (1 <= day && day <= lastDay[month - 1]) {
            return true;
        }
        return false;
    }

    private boolean leapValidation() {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    private boolean monthValidation() {
        if (month >= 1 && month <= 12) {
            return true;
        }
        return false;
    }
}
