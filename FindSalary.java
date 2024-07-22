/*
Problem statement
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) 
and the grade (an uppercase character), and depending upon which the total salary is calculated as -

totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.

Round off the total salary to the nearest integer and then print the integral part only.
*/

import java.util.*;
public class FindSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        char Grade=sc.next().charAt(0);
        float hra=(sal/100.0f)*20.0f;
        float da=(sal/100.0f)*50.0f;
        float pf=(sal/100.0f)*11.0f;
        int allow;
        if(Grade=='A'){
            allow=1700;
        }
        else if(Grade=='B'){allow=1500;}
        else {allow=1300;}
        float totalSal= sal + hra + da + allow-pf;
        int finalSal=Math.round(totalSal);
        System.out.print(finalSal);
        sc.close();

    }
}
