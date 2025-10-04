package com.mycompany.oibsip;
interface ExamActions {
    public void takeExam();
    public void submitExam();
    default void logout(){
        System.out.println("Session closed. You are logged out.");
    }
    static void examInstructions(){
        System.out.println("Answer carefully. Exam will auto submit after time is over.");
    }
}
