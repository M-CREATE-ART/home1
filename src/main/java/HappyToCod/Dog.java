package HappyToCod;

public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    void print() {
        System.out.println("I'm a Dog");
    }

    @Override
    public String toString() {
        return
                "My name is " + name;
    }
}

