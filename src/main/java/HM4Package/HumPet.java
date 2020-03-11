package HM4Package;

public class HumPet {
    public static void main(String[] args) {
    Human human = new Human("Michael", "Karleone", 1977 , 90, "Jane Karleone", "Vito Karleone" );
    Pet pet = new Pet("Dog", "Rock", 5, 75, "eat, drink, sleep");
        System.out.println(human.toString());
        System.out.println(pet.toString());
        pet.PetEat();
        pet.PetRespond();
        pet.PetFoul();

}


}
