/*Write a program to accept 3 fractional value, find it's sun and average and display*/
import java.util.*;
class Fraction
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Enter 3 Fractional Values");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        float add = a+b+c;
        float avg = (a+b+c)/3;
        System.out.println("The Result- Addition: "+add);
        System.out.println("The Result- Average: "+avg);
    }
}