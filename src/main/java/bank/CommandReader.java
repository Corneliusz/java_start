package com.company.bank;

public class CommandReader {

    int saldo = 250;
    String login = "User1";
    String haslo = "Password1";
    boolean zalogowany = false;

    public void processCommand(String command) {
        String[] commandSplit = command.split(" ");
        String firstCommand = commandSplit[0];
        if (firstCommand.isEmpty()) {
            return;
        }


//        int i = 0;

//
//        while (i < commandSplit.length) {
//            String nextValue = commandSplit[i];
//            System.out.println(nextValue);
//            i++;
//        }

        if (commandSplit[0].equals("login")) {
            String loginInput = commandSplit[1];
            String passwordInput = commandSplit[2];
            if (loginInput.equals(login) && passwordInput.equals(haslo)) {
                zalogowany = true;
                System.out.println("Zalogowales sie mordo!");
            } else {
                System.out.println("Mordo pojebales login i/lub haslo");
            }
            return;
        }

        if (!zalogowany) {
            System.out.println("Musisz sie najpierw zalogowac");
            return;
        }

        switch (firstCommand) {
            case "logout":
                zalogowany = false;
                System.out.println("Zostales poprawnie wylogowany");
                break;
            case "wplac":
                int valueIn = Integer.parseInt(commandSplit[1]);
                saldo += valueIn;
                System.out.println("wplacono " + valueIn + "€. Twoje saldo wynosi: " + saldo + "€.");
                break;
            case "wyplac":
                int valueOut = Integer.parseInt(commandSplit[1]);
                if (valueOut <= saldo) {
                    saldo -= valueOut;
                    System.out.println("wyplacono " + valueOut + "€. Twoje saldo wynosi: " + saldo + "€.");
                } else {
                    System.out.println("Nie stac cie na ta operacje");
                }
                break;
            case "saldo":
                System.out.println("Twoje saldo wynosi: " + saldo + "€");
                break;
            default:
                System.out.println("Wpisz poprawna komende");
                break;
        }
    }

}
