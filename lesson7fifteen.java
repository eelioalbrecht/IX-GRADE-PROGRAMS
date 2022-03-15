/*Write a program to input three numbers and find the sum of their square 
roots.*/
import java.util.*;
class lesson7fifteen
{
    public static void main()
    {
        double a, b, c, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        s = Math.sqrt(a) + Math.sqrt(b) + Math.sqrt(c);
        System.out.println("Sum: "+s);
    }
}