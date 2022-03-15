/*Write a program to print the telephone bill by accepting the number of calls 
from the subscriber as per the following rate. All subscriber should pay a 
rent of Rs 250.00 with the bill every month.
Number of calls 	 	 Rate per call (Rs)
First 50 calls 	 	 	 No charge
Next 50 calls 	 	 	 1.50
Next 100 calls 	 	         2.00
Above 200 calls 	 	 2.50*/

import java.util.*;
class Telephone
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double charge;
        System.out.println("Enter the number of phone call made");
        int number = sc.nextInt();
        if (number <= 50)
         charge = number * 0;
         else if (number > 50 && number <= 100)
         charge = 50 * 0 + (number - 50) * 1.50d;
        else if (number < 100 && number <=200)
        	 charge = 50 * 0 + 100 * 1.50d + (number - 100) * 2.0d;
         else
         charge = 50 * 0 + 100 * 1.50d + 50 * 2.0d + (number - 200) * 2.50d;
        double total = 250 + charge;
        System.out.println("Total: " +charge);
        System.out.println("Additional Costs: Rs. 250/- for rent");
        System.out.println("Amount Payable: Rs. " +total);
    }
    void phone()
    {
        Telephone call = new Telephone();
        call.phone();
    }
}