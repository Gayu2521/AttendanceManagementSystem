package com.attendance;

import com.attendance.dao.StudentDAO;
import com.attendance.model.Student;
import com.attendance.service.AttendanceService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO studentDAO = new StudentDAO();
        AttendanceService attendanceService = new AttendanceService();

        while(true){

            System.out.println("\nAttendance Management System");
            System.out.println("1 Add Student");
            System.out.println("2 Mark Present");
            System.out.println("3 Mark Absent");
            System.out.println("4 Exit");

            int choice=sc.nextInt();

            switch(choice){

                case 1:

                    sc.nextLine();

                    System.out.println("Enter student name");
                    String name=sc.nextLine();

                    System.out.println("Enter department");
                    String dept=sc.nextLine();

                    Student student=new Student(name,dept);

                    studentDAO.addStudent(student);

                    break;

                case 2:

                    System.out.println("Enter student ID");

                    int id1=sc.nextInt();

                    attendanceService.markPresent(id1);

                    break;

                case 3:

                    System.out.println("Enter student ID");

                    int id2=sc.nextInt();

                    attendanceService.markAbsent(id2);

                    break;

                case 4:

                    System.exit(0);

            }

        }

    }
}