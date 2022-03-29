package jst.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    Student student1 = new Student("Hans Hansen", 111);
    Student student2 = new Student("Klaus Klausen", 222);
    Student student3 = new Student("Jan Jansen", 333);
    Student[] students = {student1, student2, student3};
    StudentDB testDB = new StudentDB(students);

    @Test
    void getAllStudents() {
        assertArrayEquals(students, testDB.getAllStudents());
    }

    @Test
    void testToString() {
        String expected = "StudentDB{students=[Student{name='Hans Hansen', ID=111}, Student{name='Klaus Klausen', ID=222}, Student{name='Jan Jansen', ID=333}]}";
        assertEquals(expected, testDB.toString());
    }

    @Test
    void addStudent() {
        Student student1 = new Student("Hans Hansen", 111);
        Student student2 = new Student("Klaus Klausen", 222);
        Student student3 = new Student("Jan Jansen", 333);
        Student student4 = new Student("Tom Tomsen", 444);
        Student[] expected = {student1, student2, student3, student4};

        testDB.addStudent(student4);
        assertArrayEquals(expected, testDB.getStudents());
    }
}