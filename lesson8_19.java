/*Write a program to input an integer and check whether it is a 5-digit 
number or not. If it is extract the central digit and print it.
Example
INPUT: Enter an integer: 76549
OUTPUT: Central digit: 5
INPUT: Enter an integer: 12976
OUTPUT: Central digit: 9
INPUT: Enter an integer: 126
OUTPUT: Not a 5 digit number*/
import java.util.*;
class lesson8_19
{
    public static void main(String [] args)
    {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        n = sc.nextInt();
        if (n >= 10000 && n <= 99999)
        {
            m = (n / 100) % 10;
            System.out.println("Central digit: "+m);
        }
        else
            System.out.println("Not a 5 digit number");
    }
}