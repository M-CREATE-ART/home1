package HW6Package;

public class Human {
    String species;
    int age;
    String name;
    String surname;
    Family family;
    int year;
    int iq;

    public Human(String s) {

    }

     for(int i=0; i<10000; i++){
        Human human= new Human();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
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

    public static boolean equals(Human gulshan, Human maryam) {

    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                '}';
    }

}
