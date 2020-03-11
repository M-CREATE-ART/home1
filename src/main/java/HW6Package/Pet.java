package HW6Package;

public class Pet {
    String nickname;
    String species;
    int age;
    int trickLevel;
    String[] habits;

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.nickname = nickname;


    }
    enum Species{
        CAT, DOG;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
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

    public void PetEat() {
        System.out.println("I am eating");

    }

    public void PetRespond() {
        System.out.println("Hello, owner. I am " + nickname + " I miss you ");
    }

    public void PetFoul() {
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