package jst.student;

import java.util.Objects;

public abstract class Student {
    protected String name;
    protected int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getID();


    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
