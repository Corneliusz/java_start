package com.corneliusz;

public class Variables {

    public double calculate(double input) {
        return (input + 3) / 10;
    }

    public int reverse(int num) {
        if (num > 99 && num < 1000) {
            int lastNum = num % 10;
            num = num / 10;
            int midNum = num % 10;
            num = num / 10;
            int firstNum = num % 10;

            int result = lastNum * 100 + midNum * 10 + firstNum;

            return result;
        } else {
            System.out.println("You should enter a 3 digits number!");
            return 0;
        }
    }

    public char tescik(int score) {

        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;



    }
}


