/*Write a program to input three integers and find the sum of the last digit of the numbers.
For example if the inputs are: 
 12
 26
 35
Output:
Sum of the last digit of the integers are: 13*/
import java.util.*;
class lesson6ten
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c, s;
        System.out.println("Enter the 3 integers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = a % 10 + b % 10 + c % 10;
        System.out.println("Sum of the last digits="+s);
    }
}