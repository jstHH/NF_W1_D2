package jst.student;

import java.util.Arrays;

public class StudentDB {
    Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        int index = (int) ((double) students.length * Math.random());
        return students[index];
    }

    public void addStudent(Student newStudent) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = newStudent;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
