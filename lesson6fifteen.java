/*Write a program to input two integers (say a and b) and interchange their values and display
the result.
For Example:
INPUT: Enter two integers: 15 36
OUTPUT:
Before interchange: a=15 and b=36
After interchange: a=36 and b=15
Please note that you can take just one variable other than a and b for interchanging*/
import java.util.*;
class lesson6fifteen
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 integers:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Interchange:a=" +a+ "and b=" +b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Interchange:a=" +a+ "and b=" +b);
    }
}