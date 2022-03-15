/*Write a program to input 5 real numbers(floating point) and find their 
average. If the average is greater than 50 print good, otherwise print bad.*/
import java.util.*;
class lesson8_6
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
        avg = (a + b + c +d + e ) / 5;
        System.out.println("Average: "+avg);
        if(avg > 50)
            System.out.println("Good");
        else
            System.out.println("Bad");
    }
}