package com.attendance.service;

import com.attendance.dao.AttendanceDAO;
import com.attendance.model.Attendance;

import java.sql.Date;

public class AttendanceService {

    AttendanceDAO attendanceDAO = new AttendanceDAO();

    public void markPresent(int studentId){

        Attendance attendance = new Attendance(
                studentId,
                new Date(System.currentTimeMillis()),
                "Present"
        );

        attendanceDAO.markAttendance(attendance);
    }

    public void markAbsent(int studentId){

        Attendance attendance = new Attendance(
                studentId,
                new Date(System.currentTimeMillis()),
                "Absent"
        );

        attendanceDAO.markAttendance(attendance);
    }

}