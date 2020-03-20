package app.hw07;

public class Human {
    String name;
    String surname;
    Family family;
    int year;
    int iq;

    public Human() {

    }

    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, Family family ) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
     
    }
    public String greetPet() {
        return String.format(" Hello, %s", family.getPet().getNickname());
    }

    public String describePet() {
        String trick = family.getPet().getTrickLevel() >= 50 ? "very sly.\n" : "almost not sly.\n";
        return String.format("I have a %s, he is %d years old, he is %s", family.getPet().getSpecies(), family.getPet().getAge(), trick);
    }


    @Override
    public String toString() {
        return String.format("Human[name='%s', surname='%s', year=%d, iq=%d]", name, surname, year, iq);
    }

}
