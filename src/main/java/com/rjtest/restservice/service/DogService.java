package com.rjtest.restservice.service;

import com.rjtest.restservice.dao.api.DogDao;
import com.rjtest.restservice.model.Dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by eshcherbanova on 12/7/17.
 */
@Service
public class DogService {

    @Autowired
    DogDao dogDao;

    public Collection<Dog> getDogs() {
        return dogDao.getAll();
    }

    public Dog getDog(String id) {
        return dogDao.get(id);
    }

    public void addDog(Dog dog) {
        dogDao.add(dog);
    }

    public void update(Dog dog) {

    }
    public void delete(String id){

    }

}
