/*Define a class security having the following description:
 * String n - to store name.
 * int h    - to store number of hours for which wages to be paid.
 * double r - to store the rate of the wages per hour.
 * double w - to calculate the wages.
Write a program to compute the wages according to the given condition and
disply the output at per given format.
Output: Name    Hour    Wages
        ____    ____    _____

 * No of hours         Rate
 * Upto 40 hrs         Rs r/hour
 * For next 20 hrs     Rs 1.5 * r/hour
 * For next 20 hrs     Rs 2 * r/hour
 */
import java.util.*;
class prep5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String n = sc.nextLine();
        System.out.println("Enter hours worked: ");
        int h = sc.nextInt();
        System.out.println("Enter the rate: ");
        double r = sc.nextDouble(); 
        double w = 0;
        if (h <= 40)
            w = r / h;
        else if(h > 40 && h <= 60)
            w = (r / h) + h * (1.5 * r / h);
        else if(h > 60 && h <= 80)
            w = (r / h) + h * (2 * r / h);
        System.out.println("Name\tHour\tWages");
        System.out.println(n+"\t"+h+"\t"+w);
    }
}
