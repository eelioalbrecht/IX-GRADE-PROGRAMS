/*Write a program to input a floating point number and round it off to two 
places of decimal.
For Example:
INPUT: Enter a floating point number: 12.367
OUTPUT: Rounded off to two places of decimal:12.37
INPUT: Enter a floating point number: 14.563
OUTPUT: Rounded off to two places of decimal:14.56*/
import java.util.*;
class lesson6fourteen
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float n, t, r;
        System.out.println("Enter a floating point number:");
        n = sc.nextFloat();
        t = (int)(n * 100 + 0.5f);
        r = t / 100;
        System.out.println("Answer=" +r);
    }
}