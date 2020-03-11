package HM4Package;

public class Human {
    String species;
    int age;
    String name;
    String surname;
    int year;
    int iq;
    Human mother;
    Human father;
    Pet pet;
    public Human() {

    }

    public Human(String name, String surname, int year, int iq, String mother, String father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
    }

    public void GreetPet() {
        System.out.println(" Hello, " + pet.nickname);
    }

    public void DescribePet() {
        System.out.println("I have " + species + "He is " + age);
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
