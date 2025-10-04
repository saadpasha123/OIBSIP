package com.mycompany.oibsip;
import java.util.Scanner;
public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        User user=new OnlineUser("pasha12","123");
        OnlineUser examUser=(OnlineUser)user;
        int choice; 
        int attempt=0;
        boolean loggedin=false;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Login");
            System.out.println("2. Update Profile");
            System.out.println("3. Start Exam");
            System.out.println("4. Logout");
            System.out.print("Enter choice: ");
            choice = ip.nextInt();

            switch (choice) {
                case 1:
                     if(attempt>=3){
                        System.out.println("You have reached maximum limits of attempts.");
                        return;
                    }
                    System.out.print("Enter username: ");
                    String u = ip.next();
                    System.out.print("Enter password: ");
                    String p = ip.next();
                    if (examUser.login(u, p)) {
                        loggedin = true;                             
                        System.out.println("Login successful! and in attempts= "+attempt);                   
                    } else {
                        System.out.println("Invalid login! "+attempt);
                        attempt++;
                    }                    
                    break;

                case 2:
                    if (loggedin) {
                        System.out.print("Enter new username: ");
                        String newUser = ip.next();
                        System.out.print("Enter new password: ");
                        String newPass = ip.next();
                        examUser.updateProfile(newUser, newPass);
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;

                case 3:
                    if (loggedin) {
                        examUser.takeExam();
                        examUser.submitExam();
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;

                case 4:
                    examUser.logout();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

    }
    
}
