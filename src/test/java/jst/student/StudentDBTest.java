package jst.student;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    Student student1 = new BasicStudent("Hans Hansen", 111);
    Student student2 = new BasicStudent("Klaus Klausen", 222);
    Student student3 = new BasicStudent("Jan Jansen", 333);
    ArrayList<Student> students;
    StudentDB testDB;


    public StudentDBTest() {
        students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        testDB = new StudentDB(students);
    }


    @Test
    void getAllStudents() {
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);
        expected.add(student3);

        assertEquals(expected, testDB.getAllStudents());

    }

    @Test
    void testToString() {
        String expected = "StudentDB{students=[Student{name='Hans Hansen', ID=111}, Student{name='Klaus Klausen', ID=222}, Student{name='Jan Jansen', ID=333}]}";
        assertEquals(expected, testDB.toString());
    }

    @Test
    void removeStudentByName() {
        ArrayList<Student> expected = new ArrayList<>();
        expected.add(student1);
        expected.add(student2);

        ArrayList<Student> result = new ArrayList<>();
        result.add(student1);
        result.add(student2);
        result.add(student3);

        StudentDB testDB = new StudentDB(result);
        testDB.removeStudentByName("Jan Jansen");
        assertEquals(expected, testDB.getAllStudents());
    }

    @Test
    void addStudent() {
        Student student1 = new BasicStudent("Hans Hansen", 111);
        Student student2 = new BasicStudent("Klaus Klausen", 222);
        Student student3 = new BasicStudent("Jan Jansen", 333);
        Student student4 = new BasicStudent("Tom Tomsen", 444);
        Student[] expected = {student1, student2, student3, student4};


    }

    @Test
    void findByID_whenIDNotFound_thenThrowsException() {
        try {
            testDB.findByID(444);
            fail();
        } catch (NoSuchElementException e) {
            assertEquals(e.getMessage(), "ID nicht gefunden");
        }
    }

    @Test
    void findByID_whenIdFound_thePassed() {
        assertEquals(student1, testDB.findByID(111));
    }
}