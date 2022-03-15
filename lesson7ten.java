/*Write a program to input a real number(floating point number) and round 
it off to 2 places of decimal.
For example,
Input: 4.3678
  Output: 4.37
Input: 24.3123
  Output: 24.31*/
import java.util.*;
class lesson7ten
{
    public static void main()
    {
        double n, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number: ");
        n = sc.nextDouble();
        r = Math.round(n * 100) / 100.0;
        System.out.println("Rounded off to 2 places of decimal: "+r);
    }
}