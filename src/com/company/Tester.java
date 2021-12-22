package com.company;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 3 digits number");

        Variables v = new Variables();
        int y;

        while (true) {

           y  = scan.nextInt();

            System.out.println(v.reverse(y));

        }





    }

}
