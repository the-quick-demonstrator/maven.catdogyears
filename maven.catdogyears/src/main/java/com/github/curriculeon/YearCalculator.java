package com.github.curriculeon;

public class YearCalculator {
    public int[] calculate(int input) {
        int catYears = 0;
        int dogYears = 0;
        if (input > 2) {
            dogYears = 15 + 9 + (5 * (input-2));
            catYears = 15 + 9 + (4 * (input-2));
        } else if(input == 1){
            dogYears = 15;
            catYears = 15;
        } else {
            dogYears = 15 + 9;
            catYears = 15 + 9;
        }
        return new int[]{input, catYears, dogYears};
    }
}
