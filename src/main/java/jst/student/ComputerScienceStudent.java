package jst.student;

public class ComputerScienceStudent extends Student implements Citizen {
    private String programmingLanguage;
    private String adress;
    private int identityNumber;


    public ComputerScienceStudent(String name, int ID, String programmingLanguage) {
        super(name, ID);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

    @Override
    public String getAdress() {
        return this.adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return this.identityNumber;
    }
}
