package org.Sahon;

import org.Sahon.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem();

        school.addDepartment("Computer Science");
        school.printDepartments();

        school.addStudent("John", "Doe", "D001"); //unsure about third parameter
        school.printStudents();

        school.addTeacher("Zach", "Gagnon", "D001"); //unsure about third parameter
        school.printTeachers();

        school.modifyCourseTeacher("T001", "C001");

        school.registerCourse("S001", "C001");

        System.out.println(school);
    }
}