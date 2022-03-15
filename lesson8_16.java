/*A cloth showroom has announced the following festival discounts on the 
purchase of items, based on the total cost of the items purchased:

Total Cost          Discount (in Percentage)
1. Less than ₹2000               5%
2. ₹2001 to ₹5000                25%
3. ₹5001 to ₹10000               35%
4. Above ₹10000                  50%

Write a program to input the total cost and compute and display the amount
to be paid by the customer after availing the discount.*/
import java.util.*;
class lesson8_16
{
    public static void main(String [] args)
    {
        int tc;
        float dis, r, ap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Cost: ");
        tc = sc.nextInt();
        if(tc <= 2000)
            r = 5;
        else if(tc <= 5000)
            r = 25;
        else if(tc <= 10000)
            r = 35;
        else
            r = 50;
        dis = (r / 100) * tc;
        ap = tc - dis;
        System.out.println("Total Cost: "+tc);
        System.out.println("Discunt: " +r+ "% or Rs." +dis);
        System.out.println("Amount Payable: "+ap);
    }
}