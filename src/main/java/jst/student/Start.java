package jst.student;

public class Start {
    public static void main(String[] args) {
        Student student1 = new Student("Hans Hansen", 111);
        Student student2 = new Student("Klaus Klausen", 222);
        Student student3 = new Student("Jan Jansen", 333);
        Student[] students = {student1, student2, student3};

        StudentDB newDB = new StudentDB(students);

        for (int i = 0; i<100; i++) {
            System.out.println(newDB.randomStudent());
        }
    }
}
