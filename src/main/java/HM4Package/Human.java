package HM4Package;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Human mother;
    Human father;
    Pet pet;
    private String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;

        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }


    public String greetPet() {
       return String.format(" Hello, %s", pet.nickname);
    }

    public String describePet() {
        String trick = pet.trickLevel >= 50 ? "very sly.\n" : "almost not sly.\n";
        return String.format("I have a %s, he is %d years old, he is %s", pet.species, pet.age, trick);
    }

    @Override
    public String toString() {
        return "Human[" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                ']';
    }
}
