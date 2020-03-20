package HM4Package;

public class Main {
    public static void main(String[] args) {

        String[] habits = new String[]{"eat", "drink", "sleep"};

        Human father = new Human();
        father.name = "Mehman";
        father.surname = "Abdull";
        father.year = 1974;

        Human mother = new Human("Faxranda", "Abdull", 1976);
        Human child = new Human("Maryam", "Mammadzadeh", 1998, mother, father);
        Pet rock = new Pet("Dog", "Rock", 5, 75, habits);
        child.pet = rock;

        System.out.println(child.greetPet());
        System.out.println(child.describePet());
        System.out.println(child.toString());
        System.out.println(rock.eat());
        System.out.println(rock.foul());
        System.out.println(rock.respond());
        System.out.println(rock.toString());

    }


}
