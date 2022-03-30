package jst.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class StudentDB {
    Map<String, Student> students;

    public StudentDB(Map<String, Student> students) {
        this.students = students;
    }

    public Map<String, Student> getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        int index = (int) ((double) students.size() * Math.random());
        return students.get(index);
    }

    public void addStudent(Student newStudent) {
        students.put(newStudent.getName(), newStudent);
    }

    public void removeStudentByName (String name) {
        students.remove(name);
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
