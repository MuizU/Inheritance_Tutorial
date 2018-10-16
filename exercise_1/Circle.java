/*
 * Developed by Muiz Uvais on 10/16/18 9:42 AM.
 * Last modified 10/16/18 9:36 AM.
 * Copyright (c) 2018. All rights reserved.
 */
//Circle Class
public class Circle {
    //Radius of the Circle
    private double radius;
    //Color of the circle
    private String color = "blue";

    //No argument Constructor
    public Circle() {
    }

    //Radius Argument Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //Radius and Color argument constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Getter for radius
    public double getRadius() {
        return radius;
    }

    //Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Getter for Color
    public String getColor() {
        return color;
    }

    //Stter for Color
    public void setColor(String color) {
        this.color = color;
    }

    //Getter for Area
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    //toString Method
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}
//Cylinder Class inherited from the Circle Class
class Cylinder extends Circle {
    //Instance Variable Height
    private double height = 1;

    //No argument Constructor for the Cylinder
    public Cylinder() {
        super();
        height = 1;
    }
    //Height Argument constructor ofr the cylinder
    public Cylinder(double height) {
        this.height = height;
    }
    //Height and Radius Argument constructor ofr the cylinder
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    //Height, Radius and, Color Argument constructor ofr the cylinder
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    //Getter for height
    public double getHeight() {
        return height;
    }
    //Setter for Height
    public void setHeight(double height) {
        this.height = height;
    }
    //Overridden getter for Area
    @Override
    public double getArea() {
        return (2 * Math.PI * this.getRadius() * this.height) + (2 * super.getArea());
    }
    //getter for Volume
    public double getVolume() {
        return super.getArea() * this.height;
    }

    //toString Method
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
//Tester Class
class TestCylinder {
    public static void main(String[] args) {
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
        System.out.println("Area of Circle: " + new Circle(5).getArea() + "\nArea of Cylinder: " + new Cylinder(5, 2).getArea());
    }
}
