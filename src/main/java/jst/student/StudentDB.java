package jst.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class StudentDB {
    ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        int index = (int) ((double) students.size() * Math.random());
        return students.get(index);
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public void removeStudentByName (String name) {
        boolean treffer = false;
        int index = -1;
        for (int i = 0; i<= students.size() - 1; i++) {
            if (students.get(i).getName().equals(name)) {
                index = i;
                treffer = true;
            }
        }
        if (treffer && index != -1) {
            students.remove(index);
        }
    }

    public Student findByID (int id) throws NoSuchElementException {
        for (Student student : students) {
            if (student.getID() == id) {
                return student;
            }
        }
        throw new NoSuchElementException("ID nicht gefunden");
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
