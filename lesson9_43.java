/*Write a program to input 10 integers and print the second largest number.
Assume that there is at least one second largest number in the given set of 
integers.
For Example,
    INPUT: Enter 10 integers:
        12 35 46 22 34 56 78 89 23 21
    OUTPUT: Second Largest Integer: 78
*/
import java.util.*;
class lesson9_43
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = 0, sl = 0, i, c = 0, n;
        System.out.println("Enter 10 numbers: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            if (i == 1)
                l = n;
            else if (n > l)
            {
                sl = l;
                l = n;
            }
            else
            {
                if (l != 0)
                {
                    if (sl == 0)
                        sl = n;
                    if (n > sl)
                        sl = n;
                }
            }
        }
        System.out.println("Second Largest: " +sl);
    }
}