package com.EmployeeWage;
import java.util.Random;
import java.util.Scanner;
public class EmpWage {
    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation");
        Random r = new Random();//UC1
        int wagePerHour=20;
        int empHour;
        int empcheck = r.nextInt(3);
        // UC4 Switch case used to check employee attendance status
        switch(empcheck){ // UC1 to check the Employee is present or absent using RANDOM class.
            case 0:
                empHour=8;
                System.out.println("Employee is Present for "+empHour+" hours. ");
                break;
            case 1:// UC3 to add employee hours present for part time
                empHour=4;
                System.out.println("Employee present for part time for "+empHour+" hours. ");
                break;

            default:
                empHour=0;
                System.out.println("Employee is Absent so no salary for him...");
        }
        int wage = wagePerHour*empHour; // UC2 to calculate the daily wage for present employee
        System.out.println("Employee Wage for one day is: "+wage);
        //uc5 to calculate monthly wage of employee
        System.out.println("Enter number of working days in one month: ");
        Scanner sc = new Scanner(System.in);
        int workDays = sc.nextInt();
        int monthlyWage = wage*workDays;
        int monthlyHour = empHour*workDays;
        System.out.println("Employee monthly salary will be : "+monthlyWage);

    }
}