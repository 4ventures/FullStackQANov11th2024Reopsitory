package com.sgtest.practice;
class Order1 {
    int orderNumber;
    String orderName;
    String location;
    String itemName;

    Order1() {
        orderNumber = 13;
        orderName = "Yashaswini";
        location = "Bangalore";
        itemName = "Lipstick";
        System.out.println("Order Number:" + orderNumber);
        System.out.println("Order Name:" + orderName);
        System.out.println("Location:" + location);
        System.out.println("Item Name:" + itemName);
        System.out.println("+++++++");
    }
}
class Invoice1 {
    int previousBalance;
    int amountDue;
    int presentReading;
    int previousReading;

    Invoice1()
    {
    previousBalance=133;
    amountDue=100;
    presentReading=144;
    previousReading=155;
        System.out.println("Previous Balance:"+previousBalance);
        System.out.println("Amount Due:"+amountDue);
        System.out.println("Present Reading:"+presentReading);
        System.out.println("Previous Reading:"+previousReading);
        System.out.println("+++++++");
}
}
class Sales1 {
    int sales;
    String salesPerson;
    String city;
    int salesNumber;

    Sales1()
    {
        sales=3;
    salesPerson="Girish";
    city="Chennai";
    salesNumber=15;
        System.out.println("Sales:"+sales);
        System.out.println("Sales Person:"+salesPerson);
        System.out.println("City:"+city);
        System.out.println("Sales Number:"+salesNumber);
        System.out.println("+++++++");
}
}
    class Inventory1
    {
        int id;
        String productName;
        String productDescription;
        int price;
        Inventory1(){

        id=2;
        productName="tea mug";
        productDescription="white bird figures";
        price=150;
        System.out.println("Id:"+id);
        System.out.println("Product Name:"+productName);
        System.out.println("Product Description:"+productDescription);
        System.out.println("Price:"+price);
        }
    }
public class Demo6 {
    public static void main(String[] args) {
        Order1 obj2=new Order1();
        Invoice1 electricity=new Invoice1();
        Sales1 clothes=new Sales1();
        Inventory1 amazon=new Inventory1();
    }
}
