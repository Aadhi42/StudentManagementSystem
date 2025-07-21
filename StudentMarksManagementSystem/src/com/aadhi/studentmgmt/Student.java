package com.aadhi.studentmgmt;

public class Student {
    // Step 1: Declare variables
    String studentName;
    int[] subjectMarks = new int[5];

    // Step 2: Constructor to assign values
    public Student(String name, int[] marks) {
        studentName = name;
        subjectMarks = marks;
    }

    // Step 3: Calculate total
    public int calculateTotal() {
        int total = 0;
        for (int mark : subjectMarks) {
            total += mark;
        }
        return total;
    }

    // Step 4: Calculate average
    public float calculateAverage() {
        return (float) calculateTotal() / subjectMarks.length;
    }
}
