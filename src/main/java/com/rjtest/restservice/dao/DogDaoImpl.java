package com.rjtest.restservice.dao;

import com.rjtest.restservice.dao.api.DogDao;
import com.rjtest.restservice.model.Dog;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by eshcherbanova on 11/19/17.
 */
//@Repository
//@Profile("inMemory")
public class DogDaoImpl implements DogDao {

    public static Map<Integer, Dog> dogs;

    public DogDaoImpl(){
        dogs = new HashMap<Integer, Dog>();
        dogs.put(1, new Dog("Sheltie", 33, 7));
        dogs.put(2, new Dog("Labrador", 57, 30));
        dogs.put(3, new Dog("Beagle", 36, 10));
        dogs.put(4, new Dog("Rottweiler", 56, 35));
        dogs.put(5, new Dog("Husky", 50, 16));
        dogs.put(6, new Dog("Boxer", 20, 25));
    }

    public Collection<Dog> getAll() {
        return dogs.values();
    }

    public Dog get(String number) {
        return dogs.get(Integer.valueOf(number));
    }

    public void add(Dog dog){
        dogs.put(dogs.size()+1, dog);

    }

    public void update(String number, Dog dog) {
        dogs.put(Integer.valueOf(number), dog);
    }

    public void delete(String id) {
        dogs.remove(id);
    }
}
