package com.mycompany.oibsip.Atm;
public class ATMUser extends User implements ATMOperations{
    private String lastTransaction;
    ATMUser(String userId,String userPin,double balance){
        super(userId,userPin,balance);
        this.lastTransaction="No Transaction Yet.";
    }
    public void transactionHistory(){
        System.out.println("Last Transaction: "+lastTransaction);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            lastTransaction="WithDrawn: "+amount;
            System.out.println("You have successfully withdraw your amount. "+amount);
        }else{
            System.out.println("Insufficient balance!");
        }
    }
    public void deposit(double amount){        
            balance+=amount;
            lastTransaction="Deposit: "+amount;
            System.out.println("You have successfully deposite your amount. "+amount);        
        }    
    public void transfer(String receiverId,double amount){
        if(amount<=balance){
            balance-=amount;
            lastTransaction="Transferred "+ amount+ " to "+receiverId;
            System.out.println("You have transfer to "+receiverId+" and the amount is "+amount);
        }
    }    
    public void updatePin(String newpin){
        this.userPin=newpin;
        System.out.println("Pin successfully updated.");
    }
}
