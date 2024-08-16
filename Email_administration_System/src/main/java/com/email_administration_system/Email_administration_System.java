package com.email_administration_system;

import java.util.Scanner;

public class Email_administration_System {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name:");
        String firstName=sc.next();
        System.out.println("Enter the last name:");
        String lastName=sc.next();
        Email eml=new Email(firstName,lastName);
        eml.getAlternateEmail();
        eml.getName();
    }
}
