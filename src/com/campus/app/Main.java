package com.campus.app;

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input form student
        System.out.print("Enter student id: ");
        int studentId = scanner.nextInt();
        System.out.print("Enter student name: ");
        String studentName = scanner.next();
        System.out.print("Enter student age: ");
        int studentAge = scanner.nextInt();
        System.out.print("enter your department: ");
        String department = scanner.next();
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        int[] marks = new int[numberOfSubjects];
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

        }
        Student student = new Student(studentId, studentName, studentAge, department, marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        scanner.close();

    }
}