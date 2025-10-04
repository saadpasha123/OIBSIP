package com.mycompany.oibsip;
abstract public class User {
    protected String username;
    protected String password;
    User(String username,String password){
      this.username=username;
      this.password=password;
      }
    abstract void showProfile();
    final void systemInfo(){
        System.out.println("Welcome to online Examination System.");
    }
}