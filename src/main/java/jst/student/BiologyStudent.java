package jst.student;

public class BiologyStudent extends Student implements Citizen {
    private String animal;

    public BiologyStudent(String name, int ID, String animal) {
        super(name, ID);
        this.animal = animal;
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
    public String getAdress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}
