package com.sgtest.practice.polymorphism;
abstract class Payment{
    abstract void processPayment();
}
class CreditCard extends Payment{
    void processPayment()
    {
        System.out.println("Processing payment through Credit Card");
    }
}
class PayPal extends Payment{
    void processPayment()
    {
        System.out.println("Processing payment through PayPal");
    }
}

public class PolymorphismDemo4 {
    public static void main(String[] args) {
        Payment payment=null;

        CreditCard credit=new CreditCard();
        PayPal pay=new PayPal();

        payment=credit;
        payment.processPayment();

        payment= pay;
        payment.processPayment();


    }
}
