package HM4Package;

public class Human extends HumPet {
    String name;
    String surname;
    int year;
    int iq;
    Human mother;
    Human father;

    public Human(String name, String surname, int year, int iq, String mother, String father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}
