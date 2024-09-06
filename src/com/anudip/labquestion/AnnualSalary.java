package com.anudip.labquestion;

import java.util.Scanner;

class User {
    private int id;
    private String name;

    public User(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Employee extends User {
    private double salary;
    public Employee(int id, String name,double salary){
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnualSalary(){
        double annualSalary = salary * 12;
        return  annualSalary;
    }
}
public class AnnualSalary{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your id ");
      int id = scan.nextInt();
      scan.nextLine();

      System.out.println("Enter employee name");
      String name = scan.nextLine();

      System.out.println("Enter Monthly salary");
      double salary = scan.nextDouble();

      Employee e = new Employee(id,name,salary);

      System.out.println("Id : "+e.getId());
      System.out.println("Name : "+e.getName());
      System.out.println("Annual Salary:"+e.calculateAnnualSalary());

      scan.close();
    }

}