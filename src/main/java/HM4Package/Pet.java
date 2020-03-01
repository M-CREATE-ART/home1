package HM4Package;

public class Pet extends HumPet {
    private static String nickname;
    String species;
    int age;
    int trickLevel;
    String habits;

    public Pet(String species, String nickname, int age, int trickLevel, String habits) {
        this.species = species;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.nickname= nickname;


    }


    public static void PetEat() {
        System.out.println("I am eating");

    }

    public static void PetRespond() {

        System.out.println("Hello, owner. I am " + nickname + " I miss you ");
    }

    public static void PetFoul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species + '\'' +
                ", nickname=" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits + '\'' +
                '}';
    }
}