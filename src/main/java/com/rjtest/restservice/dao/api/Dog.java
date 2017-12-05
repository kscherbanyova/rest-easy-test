package com.rjtest.restservice.dao.api;

import java.util.Date;

/**
 * Created by eshcherbanova on 11/19/17.
 */
public class Dog {

    private String name;
    private Date dateOfBirth;
    private int height;
    private int weight;

    public Dog(){}

    public Dog(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Dog(String name, Date dateOfBirth, int height, int weight){
        this(name, height, weight);
        this.dateOfBirth = dateOfBirth;
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
