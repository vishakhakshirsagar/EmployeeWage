package com.EmployeeWage;

import java.util.Random;
public class EmpWage {
    public static final int IS_FULL_TIME = 2, IS_PART_TIME = 1;
    public  int EMP_RATE_PER_HOUR, fullTimeHrs, partTimeHrs ;
    public  int MAX_HRS_IN_MONTHS, totalEmpHrs, numOfWorkingDays;
    String companyName;

    EmpWage(String companyName, int EMP_RATE_PER_HOUR, int MAX_HRS_IN_MONTHS,
                 int numOfWorkingDays, int fullTimeHrs, int partTimeHrs ){

        this.companyName = companyName;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.MAX_HRS_IN_MONTHS = MAX_HRS_IN_MONTHS;
        this.numOfWorkingDays = numOfWorkingDays;
        this.partTimeHrs = partTimeHrs;
        this.fullTimeHrs = fullTimeHrs;

    }

    void companyInfo(){
        System.out.println("Company Name\t" + companyName + " Employee rate per hr\t" + EMP_RATE_PER_HOUR +
                " Max hrs in a month\t" + MAX_HRS_IN_MONTHS + " No. of working days\t" + numOfWorkingDays +
                " Part time working hr\t" + partTimeHrs + " Full time working hr\t" + fullTimeHrs);
    }


    public void wageComputation() {
        int dayCount = 0, empwage = 0;
        int temp=0;

        Random random = new Random();
        while ( totalEmpHrs <= MAX_HRS_IN_MONTHS && dayCount < numOfWorkingDays ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empwage = fullTimeHrs * EMP_RATE_PER_HOUR * numOfWorkingDays;
                    dayCount++;
                    totalEmpHrs+=fullTimeHrs;
                    empwage += empwage;
                    break;
                case IS_PART_TIME:
                    empwage = partTimeHrs * EMP_RATE_PER_HOUR * numOfWorkingDays;
                    dayCount++;
                    totalEmpHrs+=partTimeHrs;
                    empwage += empwage;
                    break;
                default:
            }
        }
        System.out.println("Daycount\t"+ dayCount + " "+ "Total employee hours" + totalEmpHrs);
        System.out.println("Employee Wage : " + empwage);
    }

    // Below is the main method EmpWageComputation program.
    //@param args
    public static void main(String[] args) {
        EmpWage dell = new EmpWage("Infosys",500,160,21,6,3);
        dell.companyInfo();
        dell.wageComputation();
        EmpWage lenovo = new EmpWage("Deloitte",550,150,22,8,4);
        lenovo.companyInfo();
        lenovo.wageComputation();
    }

}
