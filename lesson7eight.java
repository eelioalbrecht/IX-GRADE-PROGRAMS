/*Write a program to input the principal, rate and time and find the compound 
interest.
Compund Interest = Principal (1 + rate / 100) * time - principal*/
import java.util.*;
class lesson7eight
{
    public static void main()
    {
        double ci, p, r, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal, rate and time in order:");
        p = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();
        ci = p * Math.pow(1 + r / 100 , t ) - p;
        System.out.println("Compound Interest: "+ci);
    }
}