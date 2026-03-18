package com.attendance.model;

import java.sql.Date;

public class Attendance {

    private int id;
    private int studentId;
    private Date date;
    private String status;

    public Attendance(){}

    public Attendance(int studentId, Date date, String status){
        this.studentId = studentId;
        this.date = date;
        this.status = status;
    }

    public int getStudentId() {
        return studentId;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
}