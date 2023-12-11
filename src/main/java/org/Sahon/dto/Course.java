package org.Sahon.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Course {
    private static int nextId = 1;

    private double credit;
    private String id;
    private Student[] students = new Student[5];
    private Department department;
    private int studentNum = 0;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName, double credit, Department department) {
        this.credit = credit;
        this.id = String.format("C%03d", nextId++);
        this.department = department;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        String studentList = "[";
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                studentList += students[i].getName() + ", ";
            }
        }
        studentList += "]";

        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + studentList +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
