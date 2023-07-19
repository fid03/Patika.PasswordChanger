package PracticeTasks;

import java.util.Scanner;

public class PasswordChanger {
    public static void main(String[] args) {
        String userName,password1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your username..");
        userName=sc.nextLine();
        System.out.println("Enter your password..");
        password1=sc.nextLine();
        if(userName.equals("patika") && password1.equals("java123")){
            System.out.println("Login is succesfull!");
        }
        else{
            System.out.println("Would you like to change your password?");
            String answer=sc.nextLine();
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Enter your new password");
                String password2=sc.nextLine();
                if(password2.equals(password1) || password2.equals("java123")){
                    System.out.println("Can not generated a new password,please try again");
                }
                else{
                    System.out.println("New password generated!");
                   // System.out.println("New password: "+password2);
                }
            }
        }
    }
}
