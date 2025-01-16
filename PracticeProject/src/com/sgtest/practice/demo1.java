package com.sgtest.practice;
class Employee
{
    String fullName;
    int age;
    int salary;
    String address;
}
class Department
{
    String departmentName;
    int departmentNumber;
    String location;
    int floorNumber;

}
class Insurance
{
    String insuranceName;
    int insuranceNumber;
    String insuranceAgent;
    int areaId;

}
public class demo1 {
    public static void main(String[] args) {
        Employee obj1=new Employee();
        obj1.fullName="Sachin";
        obj1.age=26;
        obj1.salary=1500;
        obj1.address="Bangalore";
        System.out.println("Full Name:"+obj1.fullName);
        System.out.println("Age:"+obj1.age);
        System.out.println("Salary:"+obj1.salary);
        System.out.println("Address:"+obj1.address);
        System.out.println("++++++++");
        Department computer=new Department();
        computer.departmentName="Computer Science";
        computer.departmentNumber=1;
        computer.location="Chennai";
        computer.floorNumber=2;
        System.out.println("Department Name:"+computer.departmentName);
        System.out.println("Department Number:"+computer.departmentNumber);
        System.out.println("Location:"+computer.location);
        System.out.println("Floor Number:"+computer.floorNumber);
        System.out.println("+++++++++++");
        Insurance sbi=new Insurance();
        sbi.insuranceName="SBI life Insurance";
        sbi.insuranceNumber=133;
        sbi.insuranceAgent="Aditya";
        sbi.areaId=13;
        System.out.println("Insurance Name:"+sbi.insuranceName);
        System.out.println("Insurance Number:"+sbi.insuranceNumber);
        System.out.println("Insurance Agent:"+sbi.insuranceAgent);
        System.out.println("Area Id:"+sbi.areaId);





    }
}
