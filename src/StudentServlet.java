package com.kodey.servlet;

import com.kodey.model.Student;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

public class StudentServlet extends HttpServlet {
    private final String DB_URL = "jdbc:postgresql://localhost:5432/school";
    private final String USER = "postgres";
    private final String PASS = "password";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implementation for GET
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implementation for POST
        String user = request.getParameter("user");
        String fullName = request.getParameter("fullName");
        String rollNo = request.getParameter("rollNo");
        String semester = request.getParameter("semester");
        Student student = new Student(user, fullName, rollNo, semester);
        insertStudent(student);
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Implementation for PUT
    }

    private void insertStudent(Student student) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students (user, full_name, roll_no, semester) VALUES (?, ?, ?, ?)")) {
            pstmt.setString(1, student.getUser());
            pstmt.setString(2, student.getFullName());
            pstmt.setString(3, student.getRollNo());
            pstmt.setString(4, student.getSemester());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}