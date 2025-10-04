package com.mycompany.oibsip.Atm;
interface ATMOperations {
    public void transactionHistory();
    public void withdraw(double amount);
    public void deposit(double amount);
    public void transfer(String receiverId,double amount);
    default void quit(){
        System.out.println("Thank You for using ATM.");
    }
}
