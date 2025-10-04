package com.mycompany.oibsip.Atm;
public class User {
    protected String userId;
    protected String userPin;
    protected double balance;
    User(String userId,String userPin,double balance){
        this.userId=userId;
        this.userPin=userPin;
        this.balance=balance;
    }    
    final public void welcomeMSG(){
        System.out.println("Welcome to ATM System.");
    }
}
