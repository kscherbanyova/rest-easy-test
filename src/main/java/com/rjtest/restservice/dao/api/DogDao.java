package com.rjtest.restservice.dao.api;

import java.util.Collection;

/**
 * Created by eshcherbanova on 12/5/17.
 */
public interface DogDao {
    Collection getAll();
    Dog get(String id);
    void add(Dog dog);
    void update(String id, Dog dog);
    void delete(String id);
}
