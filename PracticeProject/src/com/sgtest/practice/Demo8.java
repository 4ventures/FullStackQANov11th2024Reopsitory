package com.sgtest.practice;
class  Flowers1{
    String flowerName;
    String color;
    int noofflowers;
    int types;

    Flowers1() {
        flowerName = "Rose";
        color = "Red";
        noofflowers = 10;
        types = 5;
        System.out.println("Flower Name:" + flowerName);
        System.out.println("Color:" + color);
        System.out.println("No of Flowers:" + noofflowers);
        System.out.println("Types:" + types);
    }
}
class Fruits1{
    String fruitName;
    String color;
    int nooffruits;
    int types;

    Fruits1() {
        fruitName = "Mango";
        color = "Yellow";
        nooffruits = 4;
        types = 3;
        System.out.println("Fruit Name:" + fruitName);
        System.out.println("Color:" + color);
        System.out.println("No of Fruits:" + nooffruits);
        System.out.println("Types:" + types);
    }
}
class Vegetables1{
    String Name;
    String color;
    int noofvegetables;
    int types;

    Vegetables1() {
        Name = "Radish";
        color = "White";
        noofvegetables = 3;
        types = 7;
        System.out.println("Name:" + Name);
        System.out.println("Color:" + color);
        System.out.println("No of Vegetables:" + noofvegetables);
        System.out.println("Types:" + types);
    }
}

public class Demo8 {
    public static void main(String[] args) {
        Flowers1 plant=new Flowers1();
        Fruits1 tree=new Fruits1();
        Vegetables1 obj=new Vegetables1();
    }
}
