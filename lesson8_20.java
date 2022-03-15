/*Write a program to input an integer and check whether it is a 4-digit 
number or not. If it is find the sum of first and last digit.
Example
INPUT: Enter an integer: 4765
OUTPUT: Sum of the first and last digit: 9
INPUT: Enter an integer: 7839
OUTPUT: Sum of the first and last digit: 16
INPUT: Enter an integer: 126
OUTPUT: Not a 4 digit number*/
import java.util.*;
class lesson8_20
{
    public static void main(String [] args)
    {
        int n, f, l ,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        n = sc.nextInt();
        if (n >= 1000 && n <= 9999)
        {
            f = n / 1000;
            l = n % 10;
            s = f + l;
            System.out.println("Sum of the first and last digit: "+s);
        }
        else
            System.out.println("Not a 4-digit number");
    }
}