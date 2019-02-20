package io.zipcoder;


import java.sql.SQLOutput;
import java.util.*;


public class Application {

    IOConsole ioConsole = new IOConsole();

    // Constructor
    public Application (){

    }

    public void start (){

        List <Pet> petList = new ArrayList<Pet>();
        Integer numberOfPets = ioConsole.getIntegerInput("How many pets do you have?");
        for (int i=0; i<numberOfPets ;i++)
        {
            String name = ioConsole.getStringInput("What is the name of the pet?");
            int age = ioConsole.getIntegerInput( "What is the age of the pet?");
            String petType = ioConsole.getStringInput("Is your pet a dog, cat or a horse?");

            while (!(petType.equals("dog")||(petType.equals("cat"))||(petType.equals("horse")))){

                petType= ioConsole.getStringInput("Please enter dog, cat or a horse");
            }

            Pet pet = null;
            switch (petType){

                case "dog":

               pet = new Dog(name,age);
               break;

                case "cat":
                pet = new Cat(name,age)   ;
                break;

                case "horse":

                    pet = new Horse(name, age);

                break;

        }

            //Pet pet = new Pet (name,age);
            petList.add(pet);
        }

        //Collections.sort(petList, new PetComparator());

        Collections.sort(petList);

        String result = Arrays.toString(petList.toArray());

        for(Pet pet: petList){

            ioConsole.println("Name: %s Age: %d Speaks: %s" , pet.getName(), pet.getAge(), pet.speak());
        }

        //ioConsole.println(result);

        //System.out.println(Arrays.toString(petList.toArray()));

    }


}
