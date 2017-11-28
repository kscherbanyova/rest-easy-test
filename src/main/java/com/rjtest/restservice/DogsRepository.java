package com.rjtest.restservice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by eshcherbanova on 11/20/17.
 */
public class DogsRepository {
  public static List<Dog> dogs = new ArrayList<Dog>();

  static {
    Calendar calendar = Calendar.getInstance();
    calendar.set(1988, 9,30);
    calendar.getTime();
    dogs.add(new Dog("Sheltie", 33, 7));
    dogs.add(new Dog("Labrador", 57, 30));
    dogs.add(new Dog("Beagle", 36, 10));
    dogs.add(new Dog("Rottweiler", 56, 35));
    dogs.add(new Dog("Husky", 50, 16));
    dogs.add(new Dog("Boxer", 20, 25));
  }

  public static List<Dog> getDogs() {
    return dogs;
  }

  public static void addDog(Dog dog){
    dogs.add(dog);

  }
  //invoke factory
}
