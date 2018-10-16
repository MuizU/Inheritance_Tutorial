/*
 * Developed by Muiz Uvais on 10/16/18 9:58 AM.
 * Last modified 10/16/18 9:58 AM.
 * Copyright (c) 2018. All rights reserved.
 */
//Student Class
public class Student extends Person {
    private int idNumber;
    private double fee;
    private int grade;

    //Student Constructor
    public Student(String name, int age, String gender, int idNumber) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.grade = grade;
    }

    //Getter for the Id Number
    public int getIdNumber() {
        return idNumber;
    }

    //Setter for the Id number
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    //Getter for the fee
    public double getFee() {
        return fee;
    }

    //Setter for the fee
    public void setFee(double fee) {
        this.fee = fee;
    }

    //Getter for the grade
    public int getGrade() {
        return grade;
    }

    //setter for the grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //toString Method
    @Override
    public String toString() {
        return super.toString() + " id number: " + this.idNumber + ", fee: " + this.fee + " ,grade: " + this.grade;
    }
}
