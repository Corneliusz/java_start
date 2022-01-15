package com.corneliusz.bank;

import com.corneliusz.bank.obsluga.*;

public class CommandReader {

    ObslugaSalda obslugaSalda;
    ObslugaWplaty obslugaWplaty;
    ObslugaWyplaty obslugaWyplaty;
    ObslugaLogowania obslugaLogowania;
    ObslugaWylogowania obslugaWylogowania;
    UserData userData;

    public CommandReader() {
        userData = new UserData();
        obslugaSalda = new ObslugaSalda(userData);
        obslugaWplaty = new ObslugaWplaty(userData);
        obslugaWyplaty = new ObslugaWyplaty(userData);
        obslugaLogowania = new ObslugaLogowania(userData);
        obslugaWylogowania = new ObslugaWylogowania(userData);
    }

    public void processCommand(String command) {
        String[] commandSplit = command.split(" ");
        String firstCommand = commandSplit[0];
        if (firstCommand.isEmpty()) {
            return;
        }
        if (commandSplit[0].equals("login")) {
            obslugaLogowania.obluzLogin(commandSplit);
            return;
        }
        if (!userData.isAuthorized()) {
            System.out.println("Musisz sie najpierw zalogowac");
            return;
        }
        obslugaKomendDlaZalogowanych(commandSplit, firstCommand);
    }


    private void obslugaKomendDlaZalogowanych(String[] commandSplit, String firstCommand) {
        switch (firstCommand) {
            case "logout":
                obslugaWylogowania.obsluzLogout();
                break;
            case "wplac":
                obslugaWplaty.obsluzWplate(commandSplit);
                break;
            case "wyplac":
                obslugaWyplaty.obsluzWyplate(commandSplit);
                break;
            case "saldo":
                obslugaSalda.obsluzSaldo();
                break;
            default:
                System.out.println("Wpisz poprawna komende");
                break;
        }
    }
}
