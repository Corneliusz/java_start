package com.corneliusz.bank.obsluga;

public class ObslugaSalda {
    private UserData userData;

     public ObslugaSalda (UserData userData) {
         this.userData = userData;
     }

    public void obsluzSaldo() {
        System.out.println("Twoje saldo wynosi: " + userData.currentAccount.userSaldo + "€");
    }
}
