package com.rjtest.restservice.dao;

import com.rjtest.restservice.dao.api.DogDao;
import com.rjtest.restservice.model.Dog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eshcherbanova on 12/13/17.
 */
@Repository
//@Profile("hibernate")
public class HiberDogDaoImpl implements DogDao{

  @Autowired
  private SessionFactory sessionFactory;


  public Dog get(String id) {
    return null;
  }

  public List<Dog> getAll() {
    Session session = sessionFactory.openSession();
     // List<Dog> dogsList = session.createQuery("from dogs").list();
    String hql = String.format("from Dog");
    Query SQLQuery = session.createQuery(hql);
    ArrayList<Dog> result = (ArrayList<Dog>) SQLQuery.list();
      session.close();
      return result;
  }

  public void add(Dog dog) {
    Session session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.save(dog);
    tx.commit();
    session.close();

  }

  public void update(String id, Dog dog) {

  }

  public void delete(String id) {

  }
}
