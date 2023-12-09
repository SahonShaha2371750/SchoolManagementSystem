package org.Sahon.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Student {
    private int nextId = 1;
    private final int MAX_COURSE_NUM = 5;
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private String lname;
    private Department department;

    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.id = String.format("S%03d", nextId++);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id='" + id + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=" + courses +
                '}';
    }
}
