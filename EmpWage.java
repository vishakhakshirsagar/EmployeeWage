package com.EmployeeWage;
import java.util.Random;
public class EmpWage {
    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation");
        Random r = new Random();
        int empcheck = r.nextInt(2) + 1;
        if (empcheck == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee Is Absent");
        }
    }
}
