package app.hw07;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = DayOfWeek.SUNDAY.name();
        schedule[0][1] = "do home work";
        schedule[1][0] =  DayOfWeek.MONDAY.name();
        schedule[1][1] = "go to courses";
        schedule[2][0] =  DayOfWeek.TUESDAY.name();
        schedule[2][1] = "watch a film";
        schedule[3][0] =  DayOfWeek.WEDNESDAY.name();
        schedule[3][1] = "go for a walk";
        schedule[4][0] =  DayOfWeek.THURSDAY.name();
        schedule[4][1] = "meet with friends";
        schedule[5][0] = DayOfWeek.FRIDAY.name();;
        schedule[5][1] = "play football";
        schedule[6][0] = DayOfWeek.SATURDAY.name();
        schedule[6][1] = "do not go out";
        Human father = new Human("Mehman", "Abdull", 1974, 190);
        Human mother = new Human("Faxranda", "Abdull", 1976, 190);
        Human[] child = new Human[0];
        Human maryam= new Human("Maryam", "Mammadzadeh", 1998, 157);
        Human gulshan= new Human("Gulshan", "Mammadzadeh", 1997, 161);
        String[] habits= new String[]{ "eat, drink, sleep" };

        Pet pet = new Dog("Rock", 5, 75, habits);
        Family abdull= new Family(father, mother, child);
        abdull.addChild(maryam);
        abdull.addChild(gulshan);

        abdull.countFamily();


    }
}
