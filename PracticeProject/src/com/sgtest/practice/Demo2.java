package com.sgtest.practice;
class Order
{
    int orderNumber;
    String orderName;
    String location;
    String itemName;
}
class Invoice
{
    int previousBalance;
    int amountDue;
    int presentReading;
    int previousReading;
}
class Sales
{
    int sales;
    String salesPerson;
    String city;
    int salesNumber;
}
class Inventory
{
    int id;
    String productName;
    String productDescription;
    int price;
}

public class Demo2 {
    public static void main(String[] args) {
        Order obj2=new Order();
        obj2.orderNumber=13;
        obj2.orderName="Yashaswini";
        obj2.location="Bangalore";
        obj2.itemName="Lipstick";
        System.out.println("Order Number:"+obj2.orderNumber);
        System.out.println("Order Name:"+obj2.orderName);
        System.out.println("Location:"+obj2.location);
        System.out.println("Item Name:"+obj2.itemName);
        System.out.println("+++++++");
        Invoice electricity=new Invoice();
        electricity.previousBalance=133;
        electricity.amountDue=100;
        electricity.presentReading=144;
        electricity.previousReading=155;
        System.out.println("Previous Balance:"+electricity.previousBalance);
        System.out.println("Amount Due:"+electricity.amountDue);
        System.out.println("Present Reading:"+electricity.presentReading);
        System.out.println("Previous Reading:"+electricity.previousReading);
        System.out.println("+++++++");
        Sales clothes=new Sales();
        clothes.sales=3;
        clothes.salesPerson="Girish";
        clothes.city="Chennai";
        clothes.salesNumber=15;
        System.out.println("Sales:"+clothes.sales);
        System.out.println("Sales Person:"+clothes.salesPerson);
        System.out.println("City:"+clothes.city);
        System.out.println("Sales Number:"+clothes.salesNumber);
        System.out.println("+++++++");
        Inventory amazon=new Inventory();
        amazon.id=2;
        amazon.productName="tea mug";
        amazon.productDescription="white bird figures";
        amazon.price=150;
        System.out.println("Id:"+amazon.id);
        System.out.println("Product Name:"+amazon.productName);
        System.out.println("Product Description:"+amazon.productDescription);
        System.out.println("Price:"+amazon.price);



    }
}
