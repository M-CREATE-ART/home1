package HM4Package;

import static HM4Package.Pet.*;

public class HumPet {
    public static void main(String[] args) {


    String name;
    String surname;
    int year;
    int iq;
    String species;
    String nickname;
    int age;
    int trickLevel;
    String habits;
    Human human = new Human("Michael", "Karleone", 1977 , 90, "Jane Karleone", "Vito Karleone" );
    Pet pet = new Pet("Dog", "Rock", 5, 75, "eat, drink, sleep");
        System.out.println(human.toString());
        System.out.println(pet.toString());
        PetEat();
        PetRespond();
        PetFoul();
}


}
