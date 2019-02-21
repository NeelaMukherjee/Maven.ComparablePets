package io.zipcoder;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ApplicationTest {
    private ByteArrayOutputStream byteArrOutStream = new ByteArrayOutputStream();
    private ByteArrayInputStream byteArrInStream;

    @Before
    public void changeOutputStream(){
        byteArrOutStream.reset();
        if (byteArrInStream != null) {
            byteArrInStream.reset();
        }
        System.setOut(new PrintStream(byteArrOutStream));
    }

    @After
    public void resetStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
        byteArrOutStream.reset();
        if (byteArrInStream != null) {
            byteArrInStream.reset();
        }
    }

    @Test
    public void orderByTypeTest() {
        // Given
        int numPets = 3;

        String petName1 = "Drake";
        int petAge1 = 5;
        String petType1 = "horse";

        String petName2 = "Bobobo";
        int petAge2 = 3;
        String petType2 = "cat";

        String petName3 = "Corgi";
        int petAge3 = 5;
        String petType3 = "dog";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("How many pets do you have?\nWhat is the name of the pet?\nWhat is the age of the pet?\n" +
                        "Is your pet a dog, cat or a horse?\nWhat is the name of the pet?\nWhat is the age of the pet?\nIs your pet a dog, cat or a horse?\n" +
                        "What is the name of the pet?\nWhat is the age of the pet?\nIs your pet a dog, cat or a horse?\nName: %s Age: %d Speaks: %s\nName: %s Age: %d Speaks: %s\nName: %s Age: %d Speaks: %s\n",
                petName3,petAge3, "bark!", petName2,petAge2, "meow!", petName1,petAge1, "neigh!");

        // When
        Application application = new Application();
        application.start();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    public void orderByTypeTest2() {
        // Given
        int numPets = 3;

        String petName1 = "Andrea";
        int petAge1 = 5;
        String petType1 = "horse";

        String petName2 = "Zackie";
        int petAge2 = 3;
        String petType2 = "horse";

        String petName3 = "Corgi";
        int petAge3 = 5;
        String petType3 = "dog";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("How many pets do you have?\nWhat is the name of the pet?\nWhat is the age of the pet?\n" +
                        "Is your pet a dog, cat or a horse?\nWhat is the name of the pet?\nWhat is the age of the pet?\nIs your pet a dog, cat or a horse?\n" +
                        "What is the name of the pet?\nWhat is the age of the pet?\nIs your pet a dog, cat or a horse?\nName: %s Age: %d Speaks: %s\nName: %s Age: %d Speaks: %s\nName: %s Age: %d Speaks: %s\n",
                petName3,petAge3, "bark!", petName1,petAge1, "neigh!", petName2,petAge2, "neigh!");

        // When
        Application application = new Application();
        application.start();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);


    }

    @Test
    public void orderByTypeTest3() {
        // Given
        int numPets = 3;

        String petName1 = "cocktail";
        int petAge1 = 5;
        String petType1 = "horse";

        String petName2 = "budweiser";
        int petAge2 = 3;
        String petType2 = "horse";

        String petName3 = "wine";
        int petAge3 = 5;
        String petType3 = "horse";

        String input = String.format("%d\n%s\n%d\n%s\n%s\n%d\n%s\n%s\n%d\n%s\n",
                numPets, petName1, petAge1, petType1, petName2, petAge2, petType2, petName3, petAge3, petType3);

        byteArrInStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrInStream);

        String expectedOutput = String.format("How many pets do you have?\nWhat is the name of the pet?\nWhat is the age of the pet?\n" +
                        "Is your pet a dog, cat or a horse?\nWhat is the name of the pet?\nWhat is the age of the pet?\nIs your pet a dog, cat or a horse?\n" +
                        "What is the name of the pet?\nWhat is the age of the pet?\nIs your pet a dog, cat or a horse?\nName: %s Age: %d Speaks: %s\nName: %s Age: %d Speaks: %s\nName: %s Age: %d Speaks: %s\n",
                petName2,petAge2, "neigh!", petName1,petAge1, "neigh!", petName3,petAge3, "neigh!");

        // When
        Application application = new Application();
        application.start();

        String actualOutput = byteArrOutStream.toString();
        // Then
        Assert.assertEquals(expectedOutput, actualOutput);


    }
}
