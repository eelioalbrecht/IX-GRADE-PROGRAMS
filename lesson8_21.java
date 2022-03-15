/*Write a program to input an integer and check whether it is a 3-digit number
or not. If it is check whether the sum of first and last digit is Even or 
an Odd number.
Example
INPUT: Enter an integer: 476
OUTPUT: Sum of the first and last digit is an Even number
INPUT: Enter an integer: 784
OUTPUT: Sum of the first and last digit is an Odd number
INPUT: Enter an integer: 12
OUTPUT: Not a 3 digit number*/
import java.util.*;
class lesson8_21
{
    public static void main(String [] args)
    {
        int n, f, l, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        if(n >= 100 && n <= 999)
        {
            f = n / 100;
            l = n % 10;
            s = f + l;
            if(s % 2 == 0)
                System.out.println("Sum of the first and last digits is an Even number");
            else
                System.out.println("Sum of the first and last digits is an Odd number");
        }
        else
            System.out.println("Not a 3 digit number");
    }
}