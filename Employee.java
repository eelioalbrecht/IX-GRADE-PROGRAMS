/*write a program in java to input name and basic salary of an employee.Calculate and display the gross salary and net salary*/
/*
da = 30% of basic
hra = 12.5% of basic
pf = 10% of basic
gross = basic + da + hra
netpay = gross - pf   
*/
import java.util.*;
class Employee
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name of the employee");
        String nm = sc.next();
        System.out.println ("Enter the basic salary");
        int sal = sc.nextInt();
        double da, hra, pf, gp = 0.00, np = 0.00;
        da = 0.30 * sal;
        hra = 12.5 * sal;
        pf = 0.10 * sal;
        gp = sal + da + hra;
        np = gp - pf;
        System.out.println("Name of the employee :"+nm);
        System.out.println("Basic salary : "+sal);
        System.out.println("Gross salary :"+ gp);
        System.out.println("Net salary "+np);
    }
}
