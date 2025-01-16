package com.sgtest.practice.polymorphism;
abstract class Shape
{
    abstract void draw();
}
class Circle extends Shape{
    void draw()
{
    System.out.println("Drawing a circle");
}
}
class Rectangle extends Shape{
    void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
class Square extends Shape{
    void draw()
    {
        System.out.println("Drawing a sqaure");
    }
}
public class PolymorphismDemo2 {
    public static void main(String[] args) {
        Shape shape=null;
        Circle circle =new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();
        shape=circle;
        shape.draw();
        shape=rectangle;
        shape.draw();
        shape=square;
        shape.draw();

    }
}
