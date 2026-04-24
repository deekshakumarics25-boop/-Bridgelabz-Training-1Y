package com.gla.Inheritance;

public class Main {
    public static void main(String[] args) {

        Course c1 = new Course("Java Basics", 40);
        Course c2 = new OnlineCourse("Data Structures", 60, "Coursera", true);
        Course c3 = new PaidOnlineCourse("Full Stack Development", 100, "Udemy", true, 5000, 20);

        Course[] courses = {c1, c2, c3};

        for (Course c : courses) {
            c.displayInfo();
        }
    }
}
