/*Write a program to input an integer and check whether it is Harshad or Niven
number or not. A number is said to be harshad if it is divisible by the sum 
of the digits of that number, example 126 and 1729.*/
import java.util.*;
class lesson9_36
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, d, a, s = 0;
        System.out.println("Enter an integer: ");
        a = sc.nextInt();
        for(i = a; i > 0; i /= 10)
        {
            d = i % 10;
            s += d;
        }
        if (a % s == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}