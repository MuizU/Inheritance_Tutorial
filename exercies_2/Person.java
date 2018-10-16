/*
 * Developed by Muiz Uvais on 10/16/18 10:14 AM.
 * Last modified 10/16/18 10:05 AM.
 * Copyright (c) 2018. All rights reserved.
 */
//Person Class
public class Person {
    protected String myName; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female

    public Person(String name, int age, String gender) {//Constructor for the Person Class
        super();
        myName = name;
        myAge = age;
        myGender = gender;
    }


    public String getMyName() {
        return myName;
    } //Getter for the name

    public void setMyName(String myName) {
        this.myName = myName;
    }//Setter for the name

    public int getMyAge() {
        return myAge;
    }//getter for my age

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    } //setter for my age

    public String getMyGender() {
        return myGender;
    }//getter for my gender

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }//setter for my gender

    //toString Method
    public String toString() {

        return this.myName + ",age: " + this.myAge + ",gender:" + this.myGender;
    }

}

