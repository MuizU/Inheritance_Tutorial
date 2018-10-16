/*
 * Developed by Muiz Uvais on 10/16/18 10:15 AM.
 * Last modified 10/16/18 10:10 AM.
 * Copyright (c) 2018. All rights reserved.
 */

public class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, int age, String gender,  String subject,double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        return super.toString() + " salary: " + this.salary+ ", Subject: " + this.subject;
    }
}
