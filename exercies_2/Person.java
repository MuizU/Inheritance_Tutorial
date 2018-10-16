/*
 * Developed by Muiz Uvais on 10/16/18 10:14 AM.
 * Last modified 10/16/18 10:05 AM.
 * Copyright (c) 2018. All rights reserved.
 */

public class Person {
    protected String myName; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female

    public Person(String name, int age, String gender) {
        super();
        myName = name;
        myAge = age;
        myGender = gender;
    }


    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public String toString() {

        return this.myName + ",age: " + this.myAge + ",gender:" + this.myGender;
    }

}

