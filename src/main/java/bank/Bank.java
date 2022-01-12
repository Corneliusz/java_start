package com.company.bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        CommandReader commandReader = new CommandReader();

        while (true) {
            String command = scan.nextLine();

            commandReader.processCommand(command);
        }

    }
}
