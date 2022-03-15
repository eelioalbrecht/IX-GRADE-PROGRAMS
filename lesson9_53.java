/*Write a program to input a number and print all its prime factors using prime 
factorization.
For Example,
INPUT: Enter an integer: 24
OUTPUT: Prime Factors using Prime Factorisation are:
     2
     2
     2
     3
*/
import java.util.*;
class lesson9_53
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, f, i;
        f = 2;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(i = n; i > 1;)
        {
            if (i % f == 0)
            {
                System.out.println(f);
                i = i / f;
            }
            else
                f++;
        }
    }
}