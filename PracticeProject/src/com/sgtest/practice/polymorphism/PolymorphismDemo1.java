package com.sgtest.practice.polymorphism;
abstract class AnimalDemo
{
    abstract void sound();
}
class Dog extends AnimalDemo{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
class Cat extends AnimalDemo{
    void sound()
    {
        System.out.println("Cat meows");
    }
}
class Cow extends AnimalDemo{
    void sound()
    {
        System.out.println("Cow moos");
    }
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        AnimalDemo demo=null;
        Dog dog=new Dog();
        Cat cat=new Cat();
        Cow cow=new Cow();

        demo=dog;
        demo.sound();

        demo=cat;
        demo.sound();

        demo=cow;
        demo.sound();
    }

}
