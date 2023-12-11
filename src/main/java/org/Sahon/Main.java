package org.Sahon;

import org.Sahon.dto.SchoolManagementSystem;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem school = new SchoolManagementSystem();

        school.addDepartment("Computer Science");
        school.addDepartment("Music");
        school.printDepartments();

        school.addStudent("John", "Doe", "D001");
        school.addStudent("Jane", "Doe", "D001");
        school.printStudents();

        school.addTeacher("James", "White", "D002");
        school.addTeacher("Yi", "Wang", "D001");
        school.printTeachers();

        school.addCourse("Intro to Computer Science", 3, "D001");
        school.addCourse("Music Theory", 3, "D002");

        school.modifyCourseTeacher("T001", "C001");

        school.printCourses();

        school.registerCourse("S001", "C001");
        school.registerCourse("S002", "C002");
        school.printStudents();
    }
}