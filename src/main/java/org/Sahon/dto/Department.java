package org.Sahon.dto;

public class Department {
    private final int MAX_DEPARTMENT_NUM = 5;
    private final int nextId = 1;
    private String id;
    private String departmentName;

    public Department(String id, int nextId, String departmentName) {
        this.id = String.format("D%03d", nextId++);
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
