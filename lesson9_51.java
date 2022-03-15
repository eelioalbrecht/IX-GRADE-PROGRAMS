/*Write a program to find the sum of series, taking the value of ‘n’ from 
the user.*/
import java.util.*;
class lesson9_51
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i;
        float s = 0;
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            s += (float)(i + (i + 1)) / ((i + 1) * (i + 2));
        }
        System.out.println("Sum: " +s);
    }
}