package com.sgtest.practice;
class  Flowers
{
    String flowerName;
    String color;
    int noofflowers;
    int types;
}
class Fruits
{
    String fruitName;
    String color;
    int nooffruits;
    int types;
}
class Vegetables
{
    String Name;
    String color;
    int noofvegetables;
    int types;
}

public class Demo4 {
    public static void main(String[] args) {
        Flowers plant=new Flowers();
        plant.flowerName="Rose";
        plant.color="Red";
        plant.noofflowers=10;
        plant.types=5;
        System.out.println("Flower Name:"+plant.flowerName);
        System.out.println("Color:"+plant.color);
        System.out.println("No of Flowers:"+plant.noofflowers);
        System.out.println("Types:"+plant.types);
        Fruits tree=new Fruits();
        tree.fruitName="Mango";
        tree.color="Yellow";
        tree.nooffruits=4;
        tree.types=3;
        System.out.println("Fruit Name:"+tree.fruitName);
        System.out.println("Color:"+tree.color);
        System.out.println("No of Fruits:"+tree.nooffruits);
        System.out.println("Types:"+tree.types);
        Vegetables obj=new Vegetables();
        obj.Name="Radish";
        obj.color="White";
        obj.noofvegetables=3;
        obj.types=7;
        System.out.println("Name:"+obj.Name);
        System.out.println("Color:"+obj.color);
        System.out.println("No of Vegetables:"+obj.noofvegetables);
        System.out.println("Types:"+obj.types);
    }
}
