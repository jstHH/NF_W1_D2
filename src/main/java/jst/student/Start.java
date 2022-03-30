package jst.student;

public class Start {
    public static void main(String[] args) {
        BasicStudent student1 = new BasicStudent("Hans Hansen", 111);
        BasicStudent student2 = new BasicStudent("Klaus Klausen", 222);
        BasicStudent student3 = new BasicStudent("Jan Jansen", 333);
        BasicStudent[] students = {student1, student2, student3};

        //StudentDB newDB = new StudentDB(students);

        ComputerScienceStudent student = new ComputerScienceStudent("Hans Hansen", 789, "Java");
        System.out.println(student.toString());

        BasicStudent basisBasicStudent = new BasicStudent("klaus Klausen", 654);
        System.out.println(basisBasicStudent.toString());

        Citizen computerNerd = new ComputerScienceStudent("Nerdy", 7330, "Haskell");




    }
}
