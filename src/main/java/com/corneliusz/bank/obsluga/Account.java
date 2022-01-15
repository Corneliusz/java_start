package com.corneliusz.bank.obsluga;

public class Account {
    String userName;
    String userPassword = null;
    int userSaldo;

    public Account(String userName, String userPassword, int userSaldo) {
       this.userName = userName;
       this.userPassword = userPassword;
       this.userSaldo = userSaldo;
    }
}
