package jst.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerScienceStudentTest {
    ComputerScienceStudent testStudent = new ComputerScienceStudent("Hans Hansen", 789, "Java");

    @Test
    void testToString() {
        String expected = "ComputerScienceStudent{programmingLanguage='Java', name='Hans Hansen', ID=789}";
        assertEquals(expected, testStudent.toString());
    }
}