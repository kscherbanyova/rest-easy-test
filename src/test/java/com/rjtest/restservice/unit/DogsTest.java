package com.rjtest.restservice.unit;

import static com.rjtest.restservice.dao.DogDaoImpl.dogs;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import com.rjtest.restservice.dao.DogDaoImpl;
import com.rjtest.restservice.dao.api.DogDao;
import com.rjtest.restservice.model.Dog;

import org.junit.Test;


/**
 * Created by eshcherbanova on 12/12/17.
 */
public class DogsTest {
  DogDao dogDao = new DogDaoImpl();

  @Test
  public void shouldReturnDogsCollection() {
    assertEquals(dogs.values(), dogDao.getAll());
  }

  @Test
  public void shouldReturnGivenDog() {
    Dog dog = dogs.get(1);

    assertEquals(dog, dogDao.get("1"));
  }

  @Test
  public void shouldAddDogToCollection() {
    Dog newDog = new Dog("Doberman", 56, 35);
    dogDao.add(newDog);

    assertTrue(dogs.containsValue(newDog) );
  }

  @Test
  public void shouldUpdateGivenDog() {
    Dog newDog = new Dog("Chihuahua", 17, 26);
    dogDao.update("0", newDog);

    assertEquals(newDog, dogs.get(0));
  }

  @Test
  public void shouldDeleteGivenDog() {
    Dog dog = new Dog("Beagle", 36, 10);
    dogDao.delete("3");

    assertFalse(dogs.containsValue(dog));
  }
}
