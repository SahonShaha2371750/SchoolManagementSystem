package org.Sahon.dto;

import java.util.Arrays;

public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public Course(double credit, String id, Student[] students, Department department, int studentNum, Teacher teacher,
                  String courseName) {
        this.credit = credit;
        this.id = id;
        this.students = students;
        this.department = department;
        this.studentNum = studentNum; // what about MAX_STUDENT_NUM?
        this.teacher = teacher;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + Arrays.toString(students) +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
