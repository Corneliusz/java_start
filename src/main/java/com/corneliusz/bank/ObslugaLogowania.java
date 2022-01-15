package com.corneliusz.bank;

public class ObslugaLogowania {
    private UserData userData;

    public ObslugaLogowania (UserData userData) {
        this.userData = userData;
    }
    public void obluzLogin(String[] wpis) {
        for (int i = 0; i < userData.accounts.length; i++) {
            Account account = userData.accounts[i];
            String loginInput = wpis[1];
            String passwordInput = wpis[2];
            if (loginInput.equals(account.userName) && passwordInput.equals(account.userPassword)) {
                userData.currentAccount = account;
                System.out.println("Zalogowales sie mordo!");
                return;
            }
        }
        System.out.println("Mordo pojebales login i/lub haslo");
    }
}
