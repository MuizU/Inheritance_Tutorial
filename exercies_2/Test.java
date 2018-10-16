/*
 * Developed by Muiz Uvais on 10/16/18 10:08 AM.
 * Last modified 10/16/18 10:08 AM.
 * Copyright (c) 2018. All rights reserved.
 */

public class Test {
    public static void main(String[] args) {
        Person jack = new Person("Jack Brooke", 27, "M");
        System.out.println(jack);
        Student beth = new Student("Elisabeth Smith", 16, "F", 122233);
        System.out.println(beth);
        Teacher sam = new Teacher("Sam Hamilton", 34, "M", "Computer Science",
                50000);
        System.out.println(sam);
        Person p = new Teacher ("Sam Hamilton", 34, "M", "Computer Science", 50000);//Correct Statement
        Teacher t = new Person ("Sam Hamilton", 34, "M", "Computer Science", 50000);//Wrong Statement (Compilation error)
        Person s = new Student ("Elisabeth Smith", 16, "F", 122233′);//Correct Statement
    }
}
