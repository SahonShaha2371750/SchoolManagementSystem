package org.Sahon.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Department {
    private final int MAX_DEPARTMENT_NUM = 5;
    private static int nextId = 1;
    private String id;
    private String departmentName;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
