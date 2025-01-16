package com.sgtest.practice;
class User{
    int userId;
    String userName;
    String city;
    String address;
}
class UserProfile
{
    String fullName;
    String lastName;
    int salary;
    String firstName;
}
class UserGroup
{
    String task;
    String name;
    int salary;
    String location;
}

public class Demo3 {
    public static void main(String[] args) {
        User obj4 = new User();
        obj4.userId = 1;
        obj4.userName = "Shreya";
        obj4.city = "Mysore";
        obj4.address = "VijayNagar";
        System.out.println("User Id:" + obj4.userId);
        System.out.println("User Name:" + obj4.userName);
        System.out.println("City:" + obj4.city);
        System.out.println("Address:" + obj4.address);
        System.out.println("+++++++");
        UserProfile person = new UserProfile();
        person.fullName = "Girish Kumar";
        person.lastName = "Kumar";
        person.salary = 100;
        person.firstName = "Girish";
        System.out.println("Full Name:"+person.fullName);
        System.out.println("Last Name:"+person.lastName);
        System.out.println("Salary:"+person.salary);
        System.out.println("First Name:"+person.firstName);
        System.out.println("+++++++");
        UserGroup people=new UserGroup();
        people.task="Customer Service";
        people.name="Amulya";
        people.salary= 300;
        people.location="Hassan";
        System.out.println("Task:"+people.task);
        System.out.println("Name:"+people.name);
        System.out.println("Salary:"+people.salary);
        System.out.println("Location:"+people.location);



    }
}