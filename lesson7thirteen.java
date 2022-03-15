/*Write a program to input a number and display 1, if it is positive and –1,
if it is negative.*/
import java.util.*;
class lesson7thirteen
{
    public static void main()
    {
        int n, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        s = Math.abs(n) / n;
        System.out.println(s);
    }
}