package com.attendance.dao;

import com.attendance.config.DBConnection;
import com.attendance.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

    public void addStudent(Student student) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO students(name,department) VALUES(?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());

            ps.executeUpdate();

            System.out.println("Student added successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}