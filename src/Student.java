package com.kodey.model;

public class Student {
    private String user;
    private String fullName;
    private String rollNo;
    private String semester;

    public Student(String user, String fullName, String rollNo, String semester) {
        this.user = user;
        this.fullName = fullName;
        this.rollNo = rollNo;
        this.semester = semester;
    }

    // Getters and Setters
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}