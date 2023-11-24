package org.Sahon.dto;

import java.util.Arrays;

public class Student {
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private int nextId ;
    private String lname;
    private Department department;

    public Student(String fname, Course[] courses, String id, int courseNum, int nextId, String lname,
                   Department department) {
        this.fname = fname;
        this.courses = courses;
        this.id = id;
        this.courseNum = courseNum;
        this.nextId = nextId;
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
