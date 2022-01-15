package com.corneliusz.bank;

public class ObslugaWyplaty {

    private UserData userData;

    public ObslugaWyplaty (UserData userData) {
        this.userData = userData;
    }
    public void obsluzWyplate(String[] wpis) {
        int valueOut = Integer.parseInt(wpis[1]);
        if (valueOut <= userData.currentAccount.userSaldo) {
            userData.currentAccount.userSaldo -= valueOut;
            System.out.println("wyplacono " + valueOut + "€. Twoje saldo wynosi: " + userData.currentAccount.userSaldo + "€.");
        } else {
            System.out.println("Nie stac cie na ta operacje");
        }
    }
}
