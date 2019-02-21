package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void setNameTest() {
        //Given
        String name = "random";
        int age = 4;
        Pet pet = new Pet(name,age);
        String expectedName = "Hinata";

        //When
        pet.setName("Hinata");
        String actualName = pet.getName();

        //Then
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void toStringTest() {
        //Given
        String name = "BigMac";
        int age =5;
        Pet pet = new Pet(name,age);
        String expected = "BigMac : 5" + "\n";

        //When
        String actual = pet.toString();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setAgeTest() {
        //Given
        String name = "Taka";
        int age = 6;
        Pet pet = new Pet(name,age);
        int expected = 99;

        //When
        pet.setAge(99);
        int actual = pet.getAge();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toSpeakTest() {
        //Given
        String name = "Tree";
        int age = 6;
        Pet pet = new Pet(name,age);
        String expected = null;

        //When
        String actual = pet.speak();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void dogSpeakTest() {
        //Given
        String name = "Tree";
        int age = 6;
        Pet pet = new Dog(name,age);
        String expected = "bark!";

        //When
        String actual = pet.speak();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void catSpeakTest() {
        //Given
        String name = "Tree";
        int age = 6;
        Pet pet = new Cat(name,age);
        String expected = "meow!";

        //When
        String actual = pet.speak();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void horseSpeakTest() {
        //Given
        String name = "Tree";
        int age = 6;
        Pet pet = new Horse(name,age);
        String expected = "neigh!";

        //When
        String actual = pet.speak();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void toCompareTest() {
        //Given
        Pet pet1 = new Dog("George",5);
        Pet pet2 = new Horse("Alice", 3);

        //When
        int result = pet1.compareTo(pet2);

        //Then
        Assert.assertTrue(result >0);

    }

}