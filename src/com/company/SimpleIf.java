package com.company;

import java.util.Scanner;

public class SimpleIf {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Variables v = new Variables();
        int z;

        while (true) {

            z = scan.nextInt();

            System.out.println(v.tescik(z));

        }
    }
}

