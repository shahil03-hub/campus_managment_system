package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    // calculate total marks of student
    public int calculateTotalMarks(Student student) {
        int totalMarks = 0;
        for (int mark : student.getMarks()) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    // calculate total marks
    public int calculateTotalMarks(int[] marks) {
        if (marks == null) {
            return 0;
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    // calculate average marks of student
    public double calculateAverageMarks(Student student) {
        int totalMarks = calculateTotalMarks(student);
        int numberOfSubjects = student.getMarks().length;
        if (numberOfSubjects == 0) {
            return 0.0;
        }
        return (double) totalMarks / numberOfSubjects;
    }

    // find maximum marks
    public int findMax(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }
    // find minimum marks
    public int findMin(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }
    // calculate grade based on average marks
    public String calculateGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 80) {
            return "B";
        } else if (averageMarks >= 70) {
            return "C";
        } else if (averageMarks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    // pass or fail 
    public String passOrFail(double averageMarks) {
        if (averageMarks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    // display results of student
    public void displayResults(Student student) {
        int totalMarks = calculateTotalMarks(student);
        double averageMarks = calculateAverageMarks(student);
        String grade = calculateGrade(averageMarks);
        String result = passOrFail(averageMarks);

        System.out.println("Student ID: " + student.getstudentId());
        System.out.println("Student Name: " + student.getstudentName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
    


}
