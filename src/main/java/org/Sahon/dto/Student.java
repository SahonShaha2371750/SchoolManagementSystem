package org.Sahon.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Student {
    private static int nextId = 1;
    private String fname;
    private String lname;
    private String name;
    private Course[] courses = new Course[5];
    private String id;
    private int courseNum = 0;
    private Department department;

    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.name = fname + " " + lname;
        this.id = String.format("S%03d", nextId++);
        this.department = department;
    }

    @Override
    public String toString() {
        String courseList = "[";
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {
                courseList += courses[i].getCourseName() + ", ";
            }
        }
        courseList += "]";
        return "Student{" +
                "id='" + id + '\'' +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=" + courseList +
                '}';
    }
}
