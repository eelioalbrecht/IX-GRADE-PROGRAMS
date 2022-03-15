/*Write a program to convert given number of days into months and days
Assume that each month is of 30 days. Eg: If the input is 69, then output should be-
69 days = 2 months 9 days*/
import java.util.*;
class day2month
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int date_input, month, date_output;
        System.out.println("Enter time in Dates:");
        date_input = sc.nextInt();
        month = date_input / 30;
        System.out.println("Time in month:" +month);
        date_output = month / 100;
        date_output = date_input % 30;
        System.out.println("Time in days:" +date_output);
        System.out.println(+month+ " Months " +date_output+ " Days");
    }
}