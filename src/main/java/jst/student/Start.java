package jst.student;

import java.util.HashMap;
import java.util.Map;

public class Start {
    public static void main(String[] args) {
        BasicStudent student1 = new BasicStudent("Hans Hansen", 111);
        BasicStudent student2 = new BasicStudent("Klaus Klausen", 222);
        BasicStudent student3 = new BasicStudent("Jan Jansen", 333);
        Map<String, Student> students;
        StudentDB testDB;


        students = new HashMap<>();
        students.put(student1.getName(), student1);
        students.put(student2.getName(), student2);
        students.put(student3.getName(), student3);

        testDB = new StudentDB(students);

        for (int i = 0; i <= 100; i++) {
            System.out.println(testDB.randomStudent());
        }




    }
}
