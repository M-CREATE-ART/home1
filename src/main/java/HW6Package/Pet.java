package HW6Package;

import java.util.Arrays;

public class Pet {
    String nickname;
    Species species;
    int age;
    int trickLevel;
    String[] habits;

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.nickname = nickname;


    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
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
        return "Pet[" +
                "species=" + species + '\'' +
                ", nickname=" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) + '\'' +
                ']';
    }
}