package com.mycompany.oibsip.Atm;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter User ID: ");
        String userId = ip.nextLine();
        System.out.println("Enter User PIN: ");
        String userpin = ip.nextLine();
        ATMUser user = new ATMUser("pasha123", "786", 9000);
        if (userId.equals("pasha123") && userpin.equals("786")) {
            user.welcomeMSG();
            int choice;
            do {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Transaction History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quite");
                System.out.print("Enter choice: ");
                choice = ip.nextInt();

                switch (choice) {
                    case 1:
                        user.transactionHistory();
                        break;
                    case 2:
                        System.out.println("Enter withdraw amount: ");
                        double wd = ip.nextDouble();
                        user.withdraw(wd);
                        break;
                    case 3:
                        System.out.println("Enter deposit amount: ");
                        double da = ip.nextDouble();
                        user.deposit(da);
                        break;
                    case 4:
                        ip.nextLine();
                        System.out.println("Enter reciever ID: ");
                        String rid = ip.nextLine();
                        System.out.println("Enter the Transfer amount: ");
                        double ta = ip.nextDouble();
                        user.transfer(rid, ta);
                        break;
                    case 5:
                        user.quit();
                        break;
                    default:
                        System.out.println("Invalid choice, try again.");
                }
            } while (choice != 5);
        } else {
            System.out.println("Invalid User ID and PIN. Access Denied!");
        }
        ip.close();
    }
}
