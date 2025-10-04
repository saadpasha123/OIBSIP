package com.mycompany.oibsip;
import java.util.Scanner;
public class OnlineUser extends User implements ExamActions {
    int score;
    OnlineUser(String username,String password){
        super(username,password);
        this.score=0;
    }
    public boolean login(String u, String p) {
        return u.equals(username) && p.equals(password);
    } 
    public void updateProfile(String newuser,String newpassword){
        newuser=username;
        newpassword=password;
        System.out.println("Update sucessfully!");
    }
    public void takeExam(){
        Scanner ip=new Scanner(System.in);
        System.out.println("\n Give the answers of this following questions!");
        System.out.println("Q1. What is the size of int in Java?");
        System.out.println("A) 2 bytes  B) 4 bytes  C) 8 bytes  D) Depends on OS");
        char ans1=ip.next().charAt(0);
        if(ans1=='B' || ans1=='b')score+=10;
        System.out.println("Q2. Which keyword is used to inherit a class in Java?");
        System.out.println("A) extends  B) implement  C) inherits  D) super");
        char ans2=ip.next().charAt(0);
        if(ans2=='A' || ans2=='a')score+=4;
        System.out.println("Exam Finish and your Answers are submitted...\n");
    }
    public void submitExam(){
        System.out.println("Exam submitted Your score is "+score+" /14");
    }
    public void showProfile(){
        System.out.println("Enter Your username: "+username);
        System.out.println("Enter Your password: "+password);
    }
}
