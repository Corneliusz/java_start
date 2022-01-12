package com.company;

import java.util.Scanner;

public class SimpleIf {

    public static void main(String args[]) {
//        Scanner scan = new Scanner(System.in);
//
//        Variables v = new Variables();
//        int z;
//
//        while (true) {
//
//            z = scan.nextInt();
//
//            System.out.println(v.tescik(z));
//
//        }


//        Variables variables = new Variables();
//        System.out.println(variables.calculate(6));


//        Variables newone = new Variables();
//        System.out.println(newone.tescik(68));
//        System.out.println(newone.tescik(88));
//        System.out.println(newone.tescik(44));



//        SimpleSwitch newone = new SimpleSwitch();
//        System.out.println(newone.switchTest(44));

        Practice skladnik = new Practice();
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a top for a pizza");

        while (true) {
            String top = skladnik.addToPizza(scan.nextLine());
            System.out.println(top);
        }
    }
}

