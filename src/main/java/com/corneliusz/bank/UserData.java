package com.corneliusz.bank;

public class UserData {
    public Account[] accounts;
    public Account currentAccount;

    public UserData() {
        accounts = new Account[5];
        accounts[0] = new Account("User1", "Password1", 250);
        accounts[1] = new Account("User2", "Password2", 222);
        accounts[2] = new Account("User3", "Password3", 333);
        accounts[3] = new Account("User4", "Password4", 444);
        accounts[4] = new Account("User5", "Password5", 555);
    }

    public boolean isAuthorized() {
        return currentAccount != null;
    }
}
