package org.Sahon.dto;

import java.util.Arrays;

public class Student {
    private final int nextId = 1;
    private final int MAX_COURSE_NUM = 5;
    private String fname;
    private Course[] courses = new Course[MAX_COURSE_NUM];
    private String id;
    private int courseNum;
    private String lname;
    private Department department;

    public Student(String fname, Course[] courses, String id, int courseNum, int nextId, String lname,
                   Department department) {
        this.fname = fname;
        this.courses = courses;
        this.id = String.format("S%03d", nextId++);
        this.courseNum = courseNum;
        this.lname = lname;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", id='" + id + '\'' +
                ", courseNum=" + courseNum +
                ", nextId=" + nextId +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                '}';
    }
}
