package com.studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students to add ");
    int n = sc.nextInt();
    Student students[] = new Student[n];

    for (int i = 0; i < students.length; i++) {

      students[i] = new Student();
      students[i].enrollCourses();
      students[i].paytutionBalance();
      System.out.println(students[i].StudentInfo());
      System.out.println();
    }

  }
}
