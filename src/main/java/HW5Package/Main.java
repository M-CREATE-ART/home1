package HW5Package;

public class Main {

    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "watch a film";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go for a walk";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "meet with friends";
        schedule[5][0] = "Friday";
        schedule[5][1] = "play football";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do not go out";

        String[] habits= new String[]{ "eat, drink, sleep" };

        Human father = new Human("Mehman", "Abdull", 1974, 190);
        Human mother = new Human("Faxranda", "Abdull", 1976, 190);
        Human[] child = new Human[0];
        Human maryam= new Human("Maryam", "Mammadzadeh", 1998, 153);
        Human gulshan= new Human("Gulshan", "Mammadzadeh", 1997, 157);
        gulshan.setSchedule(schedule);

        Pet rock = new Pet("dog" , "Rock", 5, 75, habits);
        Family abdull= new Family(father, mother, child);
        abdull.addChild(maryam);
        abdull.addChild(gulshan);
        abdull.setPet(rock);

        abdull.deleteChild(0);
        System.out.println( abdull.countFamily());

        System.out.println(abdull);


    }
}
