package com.company;

import java.util.Scanner;

public class Salary {

    public static void grossSalary(){
        /*
        Write a program to input basic salary of an employee and
        calculate its Gross salary according to following:

        Basic Salary <= 10000 : HRA = 20%, DA = 80%
        Basic Salary <= 20000 : HRA = 25%, DA = 90%
        Basic Salary  > 20000 : HRA = 30%, DA = 95%
        */

        float basicSalary;
        float HRA;
        float DA;
        float grosSalary;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        basicSalary = sc.nextFloat();

        if (basicSalary <= 10000){
            HRA = (basicSalary * 20) /100;
            DA  = (basicSalary * 80) /100;
        } else if (basicSalary > 10000 && basicSalary <= 20000){
            HRA = (basicSalary * 25) /100;
            DA  = (basicSalary * 90) /100;
        } else {
            HRA = (basicSalary * 30) /100;
            DA  = (basicSalary * 95) /100;
        }

        grosSalary = basicSalary + HRA + DA;

        System.out.println("The gross salary is " + grosSalary);
    }


    public static void electricityBill(){
        /*
        Write a program to input electricity unit charges and
        calculate total electricity bill according to the given condition:

        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit

        An additional surcharge of 20% is added to the bill.

        */

        float electricityUnit;
        float electricityCharge;
        float totalCharge;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity unit: ");
        electricityUnit = sc.nextFloat();

        if (electricityUnit <= 50){
            electricityCharge = (float) (electricityUnit * 0.50);
        }
        else if (electricityUnit > 50 && electricityUnit <= 150){
            electricityCharge = (float) (electricityUnit * 0.75);
        }
        else if (electricityUnit > 150 && electricityUnit <= 250){
            electricityCharge = (float) (electricityUnit * 1.20);
        }
        else{
            electricityCharge = (float) (electricityUnit * 1.50);
        }

        totalCharge = electricityCharge + ((electricityCharge * 20) /100);

        System.out.println("The total charge is: " + totalCharge);

    }


    public static void main (String[] args){

        System.out.println(" ");
        grossSalary();

        System.out.println(" ");
        electricityBill();

    }
}
// 11/22/2021
