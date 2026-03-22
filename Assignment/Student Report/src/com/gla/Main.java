package com.gla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student name:");
        String name = sc.next();
        System.out.println("Student roll number:");
        int rollNumber = sc.nextInt();
        System.out.println("Student marks:");
        int marks = sc.nextInt();

        Student st1 = new Student(name,rollNumber,marks);
        st1.display();
        st1.calculate();
    }
}
