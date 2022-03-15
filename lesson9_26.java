/*Write a program to input two integers and check whether it forms an amicable
pair or not. An amicable pair is such that, the sum of the factors excluding
itself of one number is the other number and sum of the factors excluding 
itself of the other number is this number.
Example, (220, 284) . Since sum of factors excluding itself of:
220= 1+2+4+5+10+11+20+22+ 44+55+110=284
284= 1+ 2+4+71+142=220.*/
import java.util.*;
class lesson9_26
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, a, b, sa = 0, sb = 0;
        System.out.println("Enter 2 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        for(i = 1; i < a; i++)
        {
            if (a % i == 0)
                sa += i;
        }
        for (i = 1; i < b; i++)
        {
            sb += i;
        }
        if (sa == b && sb == a)
            System.out.println("Amicable pair");
        else
            System.out.println("Not an Amicable pair");
    }
}