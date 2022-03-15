/*Write a program to input the Basic Pay of an employee and find the gross pay of the employee
for the following allowances and deductions.
Dearness Allowance = 25% of Basic Pay
House Rent Allowance=15% of Basic Pay
Provident Fund=8.33% of Basic Pay
Net Pay=Basic Pay + Dearness Allowance + House Rent Allowance
Gross Pay= Net Pay – Provident Fund*/

import java.util.*;
class lesson6twenty
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float bp, da, hra, pf, np, gp;
        System.out.println("Enter the basic pay: ");
        bp = sc.nextFloat();
        da = 25 / 100f * bp;
        hra = 15 / 100f * bp;
        pf = 8.33f / 100 * bp;
        np = bp + da + hra;
        gp = np - pf;
        System.out.println("Gross Pay: " +gp);
    }
}