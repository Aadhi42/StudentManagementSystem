package com.aadhi.studentmgmt;
public class GradeCalculator {
    public static String getGrade(float avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "Fail";
    }
}