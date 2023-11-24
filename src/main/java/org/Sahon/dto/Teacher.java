package org.Sahon.dto;

public class Teacher {
    private String fname;
    private String lname;
    private Department department;
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

    public Teacher(String fname, String lname, Department department, String id) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = id;
    }
}
