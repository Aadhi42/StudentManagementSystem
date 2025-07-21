package com.aadhi.studentmgmt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get Student Name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Step 2: Get Marks for 5 Subjects
        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Step 3: Create Student Object
        Student student = new Student(name, marks);

        // Step 4: Calculate Total, Average, Grade
        int total = student.calculateTotal();
        float average = student.calculateAverage();
        String grade = GradeCalculator.getGrade(average);

        // Step 5: Display Report
        System.out.println("\n========== STUDENT REPORT ==========");
        System.out.println("Name    : " + student.studentName);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
        System.out.println("====================================");
    }
}
