package io.zipcoder;

public class Pet implements  Comparable<Pet> {

    String name;
    Integer age;


    public Pet(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    @Override

    public String toString() {

        return name + " : " + age + "\n";
    }

    public String getName() {


        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public void setName(String name) {


        this.name = name;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public String speak() {

        return null;
    }

    @Override
    public int compareTo(Pet o) {


        //return this.name.compareTo(o.name);

        int result;
        if (this.name.compareTo(o.name) == 0) {
            result = compareTypes(this, o);
        } else {
            result = this.name.compareTo(o.name);
        }
        return result;
    }



    @SuppressWarnings("Duplicates")
    private int compareTypes(Pet thisPet, Pet otherPet) {
        int result = 0;

        if (thisPet instanceof Dog) {
            if (!(otherPet instanceof Dog)) {
                result = -1;
            }
        } else if (thisPet instanceof Cat) {
            if (otherPet instanceof Dog) {
                result = 1;
            } else if (otherPet instanceof Horse) {
                result = -1;
            }
        } else if (thisPet instanceof Horse) {
            if (!(otherPet instanceof Horse)) {
                result = 1;
            }
        }

        return result;

    }
}
