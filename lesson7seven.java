/*Write a program to input the principal, rate and time and find the Simple 
Interest.
Simple Interst = principal * rate * time / 100*/
import java.util.*;
class lesson7seven
{
    public static void main()
    {
        double si, p, r, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal, rate and time in order: ");
        p = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();
        si = (p * r * t) / 100;
        System.out.println("Simple Interest: "+si);
    }
}