package HW6Package;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human father;
    private Human mother;
    private Human children[];
    private Pet pet;
    int idx = 0;

    public Family(Human father, Human mother, Human[] children) {
        this.father = father;
        this.mother = mother;
        this.children = children;
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
    public void addChild(Human child) {
        children = Arrays.copyOf(children, idx + 1);
        children[idx] = child;
        idx++;

    }

    public boolean deleteChild(int index) {
        if (index >= children.length) {
            return false;
        } else
            for (int i = index; i < children.length - 1; i++) {
                children[index] = children[index + 1];
                idx--;
                children = Arrays.copyOf(children, idx);

            }
        return true;
    }

    boolean deleteChild(Human child) {

        int index = children.length;

        for (int i = 0; i < children.length; i++) {
            if (children[i] == child) index = i;
        }

        try{
            if (children[index] != null){

                for (int i = index; i < children.length-1; i++) {
                    children[i] = children[i+1];
                }
                idx--;
                children= Arrays.copyOf(children, idx);
                return true;
            }

        }

        catch(Exception e) {
            System.out.println("Oops, you don't have such a child. try again!");
        }
        return false;
    }


    public int countFamily() {
        return 2 + idx;
    }


    @Override
    public String toString() {
        return String.format("Family[father=%s, mother=%s, children=%s, pet=%s]", father, mother, Arrays.toString(children), pet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return idx == family.idx &&
                father.equals(family.father) &&
                mother.equals(family.mother) &&
                Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother, pet, idx);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

}

