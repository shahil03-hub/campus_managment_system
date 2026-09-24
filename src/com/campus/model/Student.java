package com.campus.model;

public class Student {
    // Encapsulation - data handling
    // instance variables
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    // static varivable
    static int studentCount = 0;

    // default constructor
    public Student() {
        studentCount++;
    }

    // parameterized constructor
    public Student(int studentid, String studentname, int age, String department, int[] markss) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        this.marks = markss;
        studentCount++;
    }

    // Getters and setters
    public int getstudentId() {
        return studentid;
    }

    public void setstudentId(int studentid) {
        this.studentid = studentid;
    }

    public String getstudentName() {
        return studentname;
    }

    public void setstudentName(String studentname) {
        this.studentname = studentname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // instance method - belongs to object
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    public void displayStudentInfo(boolean showMarks) {
        displayStudentInfo();
        if (showMarks) {
            System.out.println("Marks : " + java.util.Arrays.toString(marks));

        }
    }

    // static method - belongs to class,not object
    public static void displayStudentCount() {
        System.out.println("Total Students: " + studentCount);
    }

}
