
package com.mycompany.chatapp;

import java.util.Scanner;


public class Chatapp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n===Registration===");
        System.out.print("Enter username: ");
        String Username = input.nextLine();
        System.out.println("Enter password");
        String Password = input.nextLine();
        System.out.println("First name : ");
        String firstName = input.nextLine();
 
        System.out.println("Last name : ");
        String lastName = input.nextLine();
        System.out.println("Cell number :");
        String cellNumber = input.nextLine();
        
        Login user = new Login(Username,Password,firstName,lastName,cellNumber);
        String regResult = user.registerUser();
        System.out.println("\n" + regResult);
        //
        if(regResult.equals("Registration successful!")){
        }else{
            System.out.println("Please restart the application and try again.");
                 return;
        }
        //LOGIN
        System.out.println("\n---Login---");
        System.out.print("Username :");
        String loginUser = input.nextLine();
        System.out.print("Password :");
        String loginPass = input.nextLine();
        
        String loginStatus = user.returnLoginStatus(loginUser,loginPass);
        System.out.println("\n"+ loginStatus);
        
        if(user.loginUser(loginUser, loginPass)){
    }
}
}
