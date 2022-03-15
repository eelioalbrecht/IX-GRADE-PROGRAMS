/*Write a program to input 5 real numbers and print only those numbers 
which are less than their average.*/
import java.util.*;
class lesson8_35
{
    public static void main(String [] args)
    {
        float a, b, c, d, e, avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 real numbers: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = sc.nextFloat();
        e = sc.nextFloat();
        avg = (a + b + c + d + e) / 5;
        if (a < avg)
            System.out.println(a+" is less than its average");
        if (b < avg)
            System.out.println(b+" is less than its average");
        if (c < avg)
            System.out.println(c+" is less than its average");
        if (d < avg)
            System.out.println(d+" is less than its average");
        if (e < avg)
            System.out.println(e+" is less than its average");
    }
}