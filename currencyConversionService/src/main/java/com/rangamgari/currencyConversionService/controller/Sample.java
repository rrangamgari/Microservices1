package com.rangamgari.currencyConversionService.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
  private int empId;
  private String employeeName;
  private double salary;

  public Employee(int empId, String employeeName, double salary) {
    super();
    this.empId = empId;
    this.employeeName = employeeName;
    this.salary = salary;
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}

public class Sample {
  private static Employee[] arrayOfEmps = {
    new Employee(1, "Jeff Bezos", 100000.0),
    new Employee(2, "Bill Gates", 200000.0),
    new Employee(3, "Mark Zuckerberg", 300000.0)
  };

  public static void main(String[] args) {
    List<Employee> list = Stream.of(arrayOfEmps).sorted().collect(Collectors.toList());
    for (Employee e : list) {
      System.out.println(e.getEmployeeName());
    }
  }
}
