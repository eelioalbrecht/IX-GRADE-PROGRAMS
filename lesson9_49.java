/*Write a program to find the sum of series, taking the value of ‘a’ and ‘n’ 
from the user.
S = a/2 + a/3 + a/4 + ... + a/n*/
import java.util.*;
class lesson9_49
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, n, i;
        float s = 0;
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for(i = 2; i <= n; i++)
        {
            s += (float)a / i;
        }
        System.out.println("Sum: " +s);
    }
}