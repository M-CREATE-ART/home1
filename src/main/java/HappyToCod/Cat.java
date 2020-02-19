package HappyToCod;

public class Cat extends Animal {
    String name;

    public Cat(String name) {
        this.name = name;
    }


    void print() {
        System.out.println("I'm a Cat");

    }

    @Override
    public String toString() {
        return
                "My name is " + name;
    }
}