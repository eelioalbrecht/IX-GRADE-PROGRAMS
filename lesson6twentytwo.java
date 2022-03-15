/*Write a program to input an integer and if positive change it to negative and if negative change
it to positive.
INPUT: Enter an integer: 12
OUTPUT: Sign changed:-12
INPUT: Enter an integer: -14
OUTPUT: Sign changed: 14*/
import java.util.*;
class lesson6twentytwo
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n, s;
        System.out.println("Enter an integer:");
        n = sc.nextInt();
        s = -n;
        System.out.println("Sign changed: " +s);
    }
}