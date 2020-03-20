package HW6Package;

public class Main {


    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = DayOfWeek.Sunday.name();
        schedule[0][1] = "do home work";
        schedule[1][0] =  DayOfWeek.Monday.name();
        schedule[1][1] = "go to courses";
        schedule[2][0] =  DayOfWeek.Tuesday.name();
        schedule[2][1] = "watch a film";
        schedule[3][0] =  DayOfWeek.Wednesday.name();
        schedule[3][1] = "go for a walk";
        schedule[4][0] =  DayOfWeek.Thursday.name();
        schedule[4][1] = "meet with friends";
        schedule[5][0] = DayOfWeek.Friday.name();;
        schedule[5][1] = "play football";
        schedule[6][0] = DayOfWeek.Saturday.name();
        schedule[6][1] = "do not go out";

        Human father = new Human("Mehman", "Abdull", 1974, 190);
        Human mother = new Human("Faxranda", "Abdull", 1976, 190);
        Human[] children = new Human[0];
        Human maryam= new Human("Maryam", "Mammadzadeh", 1998, 157);
        Human gulshan= new Human("Gulshan", "Mammadzadeh", 1997, 161);
        String[] habits= new String[]{ "eat, drink, sleep" };

        Pet pet = new Pet(Species.DOG , "Rock", 5, 75, habits);
        Family abdull= new Family(father, mother, children);
        abdull.addChild(maryam);
        abdull.addChild(gulshan);

        System.out.println(abdull.countFamily());


        for (int i = 0; i < 100000; i++) {
            Human hum = new Human();
        }

    }
}
