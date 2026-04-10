package com.gla;

public class Main {
    public static void main(String[] args) {

            Calculator sum=new Sum();
            System.out.println(sum.calculate(1,5));

            Calculator subtraction=new Subtraction();
             System.out.println(subtraction.calculate(1,5));

            Calculator multiplication=new Multiplication();
            System.out.println(multiplication.calculate(1,5));


        }
    }

