/*
 * Developed by Muiz Uvais on 10/16/18 9:58 AM.
 * Last modified 10/16/18 9:58 AM.
 * Copyright (c) 2018. All rights reserved.
 */

public class Student extends Person {
    private int idNumber;
    private double fee;
    private int grade;

    public Student(String name, int age, String gender,int idNumber) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.grade = grade;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + " id number: " + this.idNumber + ", fee: " + this.fee + " ,grade: " + this.grade;
    }
}
