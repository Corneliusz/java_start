package com.corneliusz.bank;

public class ObslugaWylogowania {
    private UserData userData;

    public ObslugaWylogowania (UserData userData) {
        this.userData = userData;
    }
    public void obsluzLogout() {
        userData.currentAccount = null;
        System.out.println("Zostales poprawnie wylogowany");
    }
}
