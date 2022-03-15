/*Write a program to calculate and print the sum of each of the following series:
a. Sum (S) = 2 – 4 + 6 – 8 + ………. -20
b. Sum (S) = x/2 + x/5 + x/8 + x/11 + ... + x/20*/
import java.util.*;
class lesson9_48
{
    public static void a()
    {
        int s = 0, i;
        for(i = 1; i <= 10; i++)
        {
            if (i % 2 == 0)
                s -= 2 * i;
            else
                s += 2 * i;
        }
        System.out.println("Sum: " +s);
    }
    public static void b()
    {
        Scanner sc = new Scanner(System.in);
        int x, i;
        float s = 0;
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        for(i = 2; i <= 20; i += 3)
        {
            s += (float)x / i;
        }
        System.out.println("Sum: " +s);
    }
}