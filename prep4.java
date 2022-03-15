/*A computer manufacturing company announces a special offer to their 
costomers on purchasing Laptos and the printer accordingly.
On laptop: Discount-15%
On printer: Discount-10%
Write a program in java to calculate the discount, if a customer purchases 
a laptop and a printer*/
import java.util.*;
class prep4
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double amtL, amtP, disL, disP, costL, costP;
        System.out.println("Enter cost of Laptop: ");
        costL = sc.nextDouble();
        System.out.println("Enter cost of Printer: ");
        costP = sc.nextInt();
        disL = 15.0 / 100 * costL;
        disP = 10.0 / 100 * costP;
        amtL = costL - disL;
        amtP = costP - disP;
        System.out.println("Amount Payable for Laptop: " +amtL);
        System.out.println("Amount Payable for Printer: " +amtP);
    }
    void company()
    {
        prep4 obj = new prep4();
        obj.company();
    }
}