package org.Sahon.dto;

public class Department {
    private String id;
    private int nextId;
    private String departmentName;

    public Department(String id, int nextId, String departmentName) {
        this.id = id;
        this.nextId = nextId;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", nextId=" + nextId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
