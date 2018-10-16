/*
 * Developed by Muiz Uvais on 10/16/18 10:15 AM.
 * Last modified 10/16/18 10:10 AM.
 * Copyright (c) 2018. All rights reserved.
 */
//Class for the teacher
public class Teacher extends Person {
    private double salary;
    private String subject;

    //Constructor for teacher
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    //Getter for Salary
    public double getSalary() {
        return salary;
    }

    //Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Getter for subject
    public String getSubject() {
        return subject;
    }

    //Setter for Subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //toString Method
    @Override
    public String toString() {
        return super.toString() + " salary: " + this.salary + ", Subject: " + this.subject;
    }
}
