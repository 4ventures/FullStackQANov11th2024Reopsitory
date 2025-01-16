package com.sgtest.practice;
class User1 {
    int userId;
    String userName;
    String city;
    String address;
    User1() {
        userId = 1;
        userName = "Shreya";
        city = "Mysore";
        address = "VijayNagar";
        System.out.println("User Id:" + userId);
        System.out.println("User Name:" + userName);
        System.out.println("City:" + city);
        System.out.println("Address:" + address);
        System.out.println("+++++++");
    }
}
class UserProfile1{
    String fullName;
    String lastName;
    int salary;
    String firstName;

    UserProfile1(){
        fullName ="Girish Kumar";
    lastName ="Kumar";
    salary =100;
    firstName ="Girish";
        System.out.println("Full Name:"+fullName);
        System.out.println("Last Name:"+lastName);
        System.out.println("Salary:"+salary);
        System.out.println("First Name:"+firstName);
        System.out.println("+++++++");
}
}
class UserGroup1{
    String task;
    String name;
    int salary;
    String location;

    UserGroup1() {
        task = "Customer Service";
        name = "Amulya";
        salary = 300;
        location = "Hassan";
        System.out.println("Task:" + task);
        System.out.println("Name:" + name);
        System.out.println("Salary:" +salary);
        System.out.println("Location:" +location);
    }
}
public class Demo7 {
    public static void main(String[] args) {
        User1 obj4 = new User1();
        UserProfile1 person = new UserProfile1();
        UserGroup1 people=new UserGroup1();
    }
}
