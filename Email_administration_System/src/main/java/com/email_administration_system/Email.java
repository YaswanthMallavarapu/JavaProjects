package com.email_administration_system;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int defaultLength=10;
    private String AlternateEmail;

    public Email(String fname,String lname) {
        this.firstName=fname;
        this.lastName=lname;
        this.department=getDepartment();
        this.password=randomPassword(defaultLength);
        
        this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".company.com";
        printInfo();
        
    }
    private static String getDepartment(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Sales\n2.Development\n3.Accounts\n0.none\n");
        int Choice=sc.nextInt();
        if(Choice==1)
            return "Sales";
        else if(Choice==2)
            return "Development";
        else if(Choice==3)
            return "Accounts";
        else return "";
    }
    
    private static String randomPassword(int length){
        char password[]=new char[length];
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()_+*/";
        for(int i=0;i<length;i++){
            int idx=(int) (passwordSet.length() * Math.random());
            password[i]=passwordSet.charAt(idx);
        }
        return new String(password);
    }
    public void setalternateEmail(String alternateEmail)
    {
        this.AlternateEmail=alternateEmail;
    }
    public void changePassword(String password){
        this.password=password;
    }
    public void getName(){
        System.out.println("Name:"+firstName+" "+lastName);
    }
    public void getAlternateEmail(){
        System.out.println("alternate Email "+AlternateEmail);
    }
    private  void  printInfo(){
        System.out.println("Name:"+firstName+" "+lastName);
        System.out.println("Email:"+email);
        System.out.println("Password:"+password);
    }
}
