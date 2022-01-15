package com.corneliusz.bank;

public class ObslugaWplaty {

    private UserData userData;

    public ObslugaWplaty (UserData userData) {
        this.userData = userData;
    }

    public void obsluzWplate(String[] pis) {
        int valueIn = Integer.parseInt(pis[1]);
        userData.currentAccount.userSaldo += valueIn;
        System.out.println("wplacono " + valueIn + "€. Twoje saldo wynosi: " + userData.currentAccount.userSaldo + "€.");
    }
}
