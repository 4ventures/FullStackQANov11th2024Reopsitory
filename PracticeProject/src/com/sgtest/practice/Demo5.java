package com.sgtest.practice;
class Employee1 {
    String fullName;
    int age;
    int salary;
    String address;


    Employee1()
    {
        fullName = "Rachin";
        age = 23;
        salary = 1600;
        address = "Mysore";
        System.out.println("Full Name:" + fullName);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
        System.out.println("Address:" + address);
        System.out.println("++++++++");
    }
}
class Department1{
    String departmentName;
    int departmentNumber;
    String location;
    int floorNumber;

    Department1()
    {
        departmentName = "Information Science";
        departmentNumber = 2;
        location = "Bangalore";
        floorNumber = 4;
        System.out.println("Department Name:" + departmentName);
        System.out.println("Department Number:" + departmentNumber);
        System.out.println("Location:" + location);
        System.out.println("Floor Number:" + floorNumber);
        System.out.println("+++++++++++");
    }
}
class Insurance1{
    String insuranceName;
    int insuranceNumber;
    String insuranceAgent;
    int areaId;

    Insurance1()
    {

        insuranceName = "Kotak life Insurance";
        insuranceNumber = 132;
        insuranceAgent = "Aditi";
        areaId = 12;
        System.out.println("Insurance Name:" + insuranceName);
        System.out.println("Insurance Number:" + insuranceNumber);
        System.out.println("Insurance Agent:" + insuranceAgent);
        System.out.println("Area Id:" + areaId);

    }
}

    public class Demo5 {
        public static void main(String[] args) {
            Employee1 obj1=new Employee1();
            Department1 computer=new Department1();
            Insurance1 sbi=new Insurance1();
        }
}
