package jst.student;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BasicStudentDBTest {

    Student student1 = new BasicStudent("Hans Hansen", 111);
    Student student2 = new BasicStudent("Klaus Klausen", 222);
    Student student3 = new BasicStudent("Jan Jansen", 333);
    Map<String, Student> students;
    StudentDB testDB;


    public BasicStudentDBTest() {
        students = new HashMap<>();
        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);

        testDB = new StudentDB(students);
    }


    @Test
    void getAllStudents() {
        Map<String, Student> expected = new HashMap<>();
        expected.put(student1.getName(), student1);
        expected.put(student2.getName(), student2);
        expected.put(student3.getName(), student3);

        assertEquals(expected, testDB.getAllStudents());

    }

    @Test
    void testToString() {
        String expected = "StudentDB{students={Klaus Klausen=Student{name='Klaus Klausen', ID=222}, Hans Hansen=Student{name='Hans Hansen', ID=111}, Jan Jansen=Student{name='Jan Jansen', ID=333}}}";
        assertEquals(expected, testDB.toString());
    }

    @Test
    void removeStudentByName() {
        Map<String, Student> expected = new HashMap<>();
        expected.put(student1.getName(), student1);
        expected.put(student2.getName(), student2);

        Map<String, Student> result = new HashMap<>();
        result.put(student1.getName(), student1);
        result.put(student2.getName(), student2);
        result.put(student3.getName(), student3);

        StudentDB testDB = new StudentDB(result);
        testDB.removeStudentByName("Jan Jansen");
        assertEquals(expected, testDB.getAllStudents());
    }

    @Test
    void addStudent() {
        Student student4 = new BasicStudent("Tom Tomsen", 444);

        Map<String, Student> expected = new HashMap<>();
        expected.put(student1.getName(), student1);
        expected.put(student2.getName(), student2);
        expected.put(student3.getName(), student3);
        expected.put(student4.getName(), student4);

        Map<String, Student> result = new HashMap<>();
        result.put(student1.getName(), student1);
        result.put(student2.getName(), student2);
        result.put(student3.getName(), student3);
        StudentDB testDB = new StudentDB(result);

        testDB.addStudent(student4);

        assertEquals(expected, testDB.getStudents());




    }
}