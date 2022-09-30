package com.EmployeeWage;
import java.util.Random;
public class EmpWage {
    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation");
        Random r = new Random();//UC1
        int wagePerHour=20;
        int empHour;
        int empcheck = r.nextInt(2) + 1;
        if (empcheck == 1) {
            empHour=8;
            System.out.println("Employee is present");
        } else{
            empHour = 0;
            System.out.println("Employee Is Absent");
        }
        int wage = wagePerHour*empHour; // UC2 to calculate the daily wage for present employee
        System.out.println("Employee Wage for one day is: "+wage);}
}
