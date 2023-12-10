package org.Sahon.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {
    private int nextId = 1;
    private String fname;
    private String lname;
    private Department department;
    private Course[] courses;
    private String id;

    @Override
    public String toString() {
        return "Teacher{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }

    public Teacher(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }
}
