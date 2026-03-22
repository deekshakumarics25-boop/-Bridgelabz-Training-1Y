package com.gla;

public class Student {
    String name;
    int rollNumber;
    int marks;
    String grade;

    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    void calculate(){
        if(marks>90){
            System.out.println("A");
        }else if(marks>80){
            System.out.println("B");
        }else if(marks>70){
            System.out.println("C");
        }else if(marks>60){
            System.out.println("D");
        }else{
            System.out.println("Fail");
        }
    }
    void display(){
        System.out.println("Student name:"+name);
        System.out.println("Student roll number:"+rollNumber);
        System.out.println("Student marks:"+marks);
        System.out.println("Student grade:"+grade);
    }
}
