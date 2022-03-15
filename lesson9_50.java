/*Write a program to find the sum of series, taking the value of ‘a’ and ‘n’
from the user.*/
import java.util.*;
class lesson9_50
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, n, i, c = 1;
        float s = 0;
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            s = s +(float)(a + c) / (c + 1);
            c += 2;
        }
        System.out.println("Sum: " +s);
    }
}