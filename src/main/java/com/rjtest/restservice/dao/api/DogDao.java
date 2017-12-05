package com.rjtest.restservice.dao.api;

import java.util.Collection;

/**
 * Created by eshcherbanova on 12/5/17.
 */
public interface DogDao {
    Collection getAll();
    Dog get(int number);
    void add(Dog dog);
    void update(Dog dog);
    void delete(int number);
}
