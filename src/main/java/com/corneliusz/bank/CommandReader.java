package com.corneliusz.bank;

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
        if (commandSplit[0].equals("login")) {
            this.obluzLogin(commandSplit);
            return;
        }
        if (!zalogowany) {
            System.out.println("Musisz sie najpierw zalogowac");
            return;
        }
        obslugaKomendDlaZalogowanych(commandSplit, firstCommand);
    }

    public void obsluzWyplate(String[] wpis) {
        int valueOut = Integer.parseInt(wpis[1]);
        if (valueOut <= saldo) {
            saldo -= valueOut;
            System.out.println("wyplacono " + valueOut + "€. Twoje saldo wynosi: " + saldo + "€.");
        } else {
            System.out.println("Nie stac cie na ta operacje");
        }
    }

    public void obsluzWplate(String[] pis) {
        int valueIn = Integer.parseInt(pis[1]);
        saldo += valueIn;
        System.out.println("wplacono " + valueIn + "€. Twoje saldo wynosi: " + saldo + "€.");
    }

    public void obsluzSaldo() {
        System.out.println("Twoje saldo wynosi: " + saldo + "€");
    }

    public void obsluzLogout() {
        zalogowany = false;
        System.out.println("Zostales poprawnie wylogowany");
    }

    public void obluzLogin(String[] wpis) {
        String loginInput = wpis[1];
        String passwordInput = wpis[2];
        if (loginInput.equals(login) && passwordInput.equals(haslo)) {
            zalogowany = true;
            System.out.println("Zalogowales sie mordo!");
        } else {
            System.out.println("Mordo pojebales login i/lub haslo");
        }
    }

    public void obslugaKomendDlaZalogowanych(String[] commandSplit, String firstCommand) {
        switch (firstCommand) {
            case "logout":
                this.obsluzLogout();
                break;
            case "wplac":
                this.obsluzWplate(commandSplit);
                break;
            case "wyplac":
                this.obsluzWyplate(commandSplit);
                break;
            case "saldo":
                this.obsluzSaldo();
                break;
            default:
                System.out.println("Wpisz poprawna komende");
                break;
        }
    }
}
