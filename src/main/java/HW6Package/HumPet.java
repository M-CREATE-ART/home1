package HW6Package;

public class HumPet {


    public static void main(String[] args) {
        Human father = new Human("Mehman", "Abdull", 1974, 190);
        Human mother = new Human("Faxranda", "Abdull", 1976, 190);
        Human[] child = new Human[0];
        Human maryam= new Human("Maryam", "Mammadzadeh", 198, 157);
        Human gulshan= new Human("Gulshan", "Mammadzadeh", 198, 157);
        String[] habits= new String[]{ "eat, drink, sleep" };

        Pet pet = new Pet("dog" , "Rock", 5, 75, habits);
        Family abdull= new Family(father, mother, child);
        abdull.addChild(maryam);
        abdull.addChild(gulshan);

        abdull.countFamily(1);



    }
}
