package io.zipcoder;

import java.util.Date;

public class Dog extends Pet {

    public Dog(String name,Integer age) {
        super(name, age);
    }

    public String speak()
    {
        return "bark!";
    }

}
