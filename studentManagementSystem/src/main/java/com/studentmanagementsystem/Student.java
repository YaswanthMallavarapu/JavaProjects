
package com.studentmanagementsystem;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = "";
    private int tutionBalance;
    private static int costOfCourses = 600;
    public static int id = 1001;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student firstName :");
        this.firstName = sc.nextLine();

        System.out.println("Enter the student lastName :");
        this.lastName = sc.nextLine();

        System.out.println("Enter the student class :");
        this.gradeYear = sc.nextInt();
        this.studentId = setId();

    }

    private String setId() {

        return gradeYear + "" + id++;
    }

    public void enrollCourses() {

        do {

            System.out.println("enter the course to enroll(Q to quit)");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + " " + course;
                tutionBalance += costOfCourses;

            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Courses enrolled :" + courses);
    }

    public void viewTutionBalance() {
        System.out.println("Your tution Balance is :" + tutionBalance + "Rs");
    }

    public void paytutionBalance() {
        viewTutionBalance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to pay ");
        int amount = sc.nextInt();
        tutionBalance -= amount;
        System.out.println("Thanks for the payment of " + amount + "Rs");
        viewTutionBalance();
    }

    public String StudentInfo() {
        return "Name :" + firstName + " " + lastName + "\n" + "Class " + gradeYear + "\n" + "Courses:" + courses + "\n"
                + "Balance:" + tutionBalance;
    }
}
