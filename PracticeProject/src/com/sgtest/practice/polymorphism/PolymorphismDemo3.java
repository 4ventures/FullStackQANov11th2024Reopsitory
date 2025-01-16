package com.sgtest.practice.polymorphism;
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}

public class PolymorphismDemo3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition of two intgers:" + calc.add(10, 20));
        System.out.println("Addition of three intgers:" + calc.add(20, 30, 40));
        System.out.println("Addition of two doubles:" + calc.add(10.3, 20.5));
    }

}
