package org.Sahon.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Course {
    private int nextId = 1;
    private static int studentCounter = 0;

    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    public Course(String courseName, double credit, Department department) {
        this.credit = credit;
        this.id = String.format("C%03d", nextId++);
        this.students = students;
        this.department = department;
        this.studentNum = ++studentCounter;
        this.teacher = teacher;
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "credit=" + credit +
                ", id='" + id + '\'' +
                ", students=" + students +
                ", department=" + department +
                ", studentNum=" + studentNum +
                ", teacher=" + teacher +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
