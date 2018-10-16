/*
 * Developed by Muiz Uvais on 10/16/18 9:42 AM.
 * Last modified 10/16/18 9:36 AM.
 * Copyright (c) 2018. All rights reserved.
 */

public class Circle {
    private double radius;
    private String color="blue";

    public  Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
class Cylinder extends Circle{
    private double height =1;
    public Cylinder() {
        super();
        height=1;
    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (2*Math.PI*this.getRadius()*this.height)+(2*super.getArea());
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " +super.toString()+ " height=" + height;
    }
}
class TestCylinder {
    public static void main (String[] args) {
// Declare and allocate a new instance of cylinder
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());
// Declare and allocate a new instance of cylinder, specifying Height
        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
// Declare and allocate a new instance of cylinder specifying radius and height
        Cylinder c3 = new Cylinder(5.0, 10.0);


        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());
        System.out.println("Area of Circle: "+new Circle(5).getArea()+"\nArea of Cylinder: "+new Cylinder(5,2).getArea());
    }
}
