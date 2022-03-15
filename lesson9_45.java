/*Write a program to print the sum of negative numbers, sum of positive even 
numbers and sum of positive odd numbers from a list of numbers (N) entered by
the user. The list terminates when the user enters a zero.*/
import java.util.*;
class lesson9_45
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, se = 0, so = 0;
        for(;true;)
        {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n == 0)
                break;
            if (n % 2 == 0 && n > 0)
                se += n;
            else if (n % 2 == 1 && n > 0)
                so += n;
        }
        System.out.println("Sum of Positive Even Numbers: " +se);
        System.out.println("Sum of Positive Odd Numbers: " +so);
    }
}