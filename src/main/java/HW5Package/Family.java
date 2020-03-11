package HW5Package;

import java.util.Arrays;

public class Family {
    private Human father;
    private Human mother;
    private Human children[];
    private Pet pet;
    String family;
    int idx = 0;

    public Family(Human father, Human mother, Human[] children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
    }

    public void addChild(Human child) {
        children = Arrays.copyOf(children, idx+1);
        children[idx] = child;
        idx++;

    }

    public boolean deleteChild(int index) {
        if (index >= children.length) {
            return false;
        } else
            for (int i = index; i < children.length-1; i++) {
                children[index] = children[index + 1];
                idx--;
                children = Arrays.copyOf(children, idx);

            }
        return true;
    }

    public void countFamily(int count) {
        count = 2 + idx;
    }


    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet1) {
        this.pet = pet1;
    }


    public void GreetPet() {
        System.out.println(" Hello, " + pet.getNickname());
    }

    public void DescribePet() {
        System.out.println("I have " + getPet().getSpecies() + "He is " + getPet().getAge());
    }

    @Override
    public String toString() {
        return String.format("Family[father=%s, mother=%s, children=%s, pet=%s]", father, mother, Arrays.toString(children), pet);
    }

}
