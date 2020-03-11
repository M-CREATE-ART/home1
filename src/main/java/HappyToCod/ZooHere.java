package HappyToCod;

public class ZooHere {
    public static void main(String[] args) {
        String name;
        Animal animal = new Animal();
        Cat cat = new Cat("Mew");
        Cat cat1 = new Cat("Mow");
        Dog dog = new Dog("How");
        Dog dog1 = new Dog("Hew");
        cat.print();
        System.out.println(cat.toString());
        System.out.println(cat1.toString());
        dog.print();
        System.out.println(dog.toString());
        System.out.println(dog1.toString());


    }
}
