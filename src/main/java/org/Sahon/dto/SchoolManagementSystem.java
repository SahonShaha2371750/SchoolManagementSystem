package org.Sahon.dto;

public class SchoolManagementSystem {

    /**
     * searches a department based on its departmentId
     * @param departmentId the id of the department
     * @return all information on the department
     */
    public Department findDepartment(String departmentId) {

    }

    /**
     * Displays all teachers
     */
    public void printTeachers() {

    }

    /**
     * Adds a course to a teacher
     * @param teacherId the id of the teacher that gets a new course
     * @param courseId id of the course that the teacher will get
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     * Creates a new department
     * @param departmentName name of the new department
     */
    public void addDepartment(String departmentName)  {

    }

    /**
     * Shows all students and their information
     */
    public void printStudents() {

    }

    /**
     * Finds a student based on their studentId
     * @param studentId the id of the student
     * @return all the information of the student
     */
    public Student findStudent(String studentId) {

    }

    /**
     * Creates a new course
     * @param courseName Adds a name to the course
     * @param credit Sets the amount of credits for the course
     * @param department Assigns the department in which the course will be in
     */
    public void addCourse(String courseName, int credit, String department ) {

    }

    /**
     * Gives a course to a student based on the id of the course
     * @param studentId Selects the student which the course will be assigned to
     * @param courseId The id of the course
     */
    public void registerCourse(String studentId, String courseId) {

    }

    /**
     * Creates a new teacher
     * @param fname first name of the teacher
     * @param lname last name of the teacher
     * @param departmentId the department that the teacher will be assigned to
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        Teacher t1 =
    }

    /**
     * Shows all the information of a certain course
     * @param courseId id of the course
     * @return all the information of the course
     */
    public Course findCourse(String courseId) {

    }

    /**
     * Shows all the existing courses
     */
    public void printCourses() {

    }

    /**
     * Shows all the existing departments
     */
    public void printDepartments() {

    }

    /**
     * Creates a new student
     * @param fname assigns a first name to the student
     * @param lname assignes a last name to the student
     * @param departmentId the department that the student will be assigned to
     */
    public void addStudent(String fname, String lname, String departmentId) {

    }

    /**
     * Finds the information of the teacher
     * @param teacherId the id of the teacher whose information will be displayed
     * @return all the information of the teacher
     */
    public Teacher findTeacher(String teacherId) {

    }
}
