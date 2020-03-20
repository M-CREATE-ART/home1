package HM4Package;

import java.util.Arrays;

public class Pet {
    String nickname;
    String species;
    int age;
    int trickLevel;
    String[] habits;

    public Pet() {
    }

    public Pet(String nickname, String species) {
        this.nickname = nickname;
        this.species = species;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.nickname = nickname;


    }

    public String eat() {
       return String.format("I am eating");
    }

    public String respond() {
        return String.format("Hello, owner. I am %s. I miss you", nickname);
    }

    public String foul() {
        return String.format("I need to cover it up");
    }

    @Override
    public String toString() {
        return String.format("%s[ nickname=%s', age=%d, trickLevel=%d, habits=%s']", species, nickname, age, trickLevel, Arrays.toString(habits));
    }
}