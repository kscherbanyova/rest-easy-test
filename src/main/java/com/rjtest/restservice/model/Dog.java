package com.rjtest.restservice.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by eshcherbanova on 12/13/17.
 */
@Entity
@Table(name = "dogs")
public class Dog implements Serializable {

  @Id
  @Column(name = "name")
  private String name;

  @Column(name = "date_of_birth")
  private Date dateOfBirth;

  @Column(name = "height")
  private int height;

  @Column(name = "weight")
  private int weight;

  public Dog() {
  }

  public Dog(String name, int height, int weight){
    this.name = name;
    this.height = height;
    this.weight = weight;
  }

  public Dog(String name, Date dateOfBirth, int height, int weight) {
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.height = height;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
