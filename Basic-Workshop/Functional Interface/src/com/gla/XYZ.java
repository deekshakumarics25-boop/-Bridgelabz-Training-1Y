package com.gla;

public class XYZ {
    static Calculator sum=(int a, int b) -> a+b;
    static Calculator multiplication=(int a, int b) -> a*b;
    static Calculator subtraction=(int a, int b) -> a-b;


    public static void calculate(Calculator imp,int a,int b){
        imp.calculate(a,b);
    }

    public static void main(String[] args) {
        calculate(sum,1,5);
        calculate(multiplication,1,5);
        calculate(subtraction,1,5);
    }
}
