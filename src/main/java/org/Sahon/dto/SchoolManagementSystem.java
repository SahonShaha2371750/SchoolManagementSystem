package org.Sahon.dto;

public class SchoolManagementSystem {
    private Department[] departments;
    private Student[] students;
    private Teacher[] teachers;
    private Course[] courses;

    /**
     * searches a department based on its departmentId
     * @param departmentId the id of the department
     * @return all information on the department
     */
    public Department findDepartment(String departmentId) {
        int num = 0; // FIND A BETTER VARIABLE NAME
        for (int i = 0; i < departments.length; i++) {
            num++;
            if ((departments[i]).getId() == departmentId) {
                break;
            }
        }
        return departments[num];
    }

    /**
     * Displays all teachers
     */
    public void printTeachers() {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                System.out.println("No departments found");
                break;
            }
            else {
                System.out.println(teachers[i]);
            }
        }
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
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                System.out.println("No students found");
                break;
            }
            else {
                System.out.println(students[i]);
            }
        }
    }

    /**
     * Finds a student based on their studentId
     * @param studentId the id of the student
     * @return all the information of the student
     */
    public Student findStudent(String studentId) {
        int num = 0; // FIND A BETTER VARIABLE NAME
        for (int i = 0; i < students.length; i++) {
            num++;
            if ((students[i]).getId() == studentId) {
                break;
            }
        }
        return students[num];
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

    }

    /**
     * Shows all the information of a certain course
     * @param courseId id of the course
     * @return all the information of the course
     */
    public Course findCourse(String courseId) {
        int num = 0; // FIND A BETTER VARIABLE NAME
        for (int i = 0; i < courses.length; i++) {
            num++;
            if ((courses[i]).getId() == courseId) {
                break;
            }
        }
        return courses[num];
    }

    /**
     * Shows all the existing courses
     */
    public void printCourses() {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                System.out.println("No courses found");
                break;
            }
            else {
                System.out.println(courses[i]);
            }
        }
    }

    /**
     * Shows all the existing departments
     */
    public void printDepartments() {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                System.out.println("No department found");
                break;
            }
            else {
                System.out.println(departments[i]);
            }
        }
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
        int num = 0; // FIND A BETTER VARIABLE NAME
        for (int i = 0; i < teachers.length; i++) {
            num++;
            if ((teachers[i]).getId() == teacherId) {
                break;
            }
        }
        return teachers[num];

    }
}
