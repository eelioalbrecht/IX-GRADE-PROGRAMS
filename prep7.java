/*Write a program to input two integers and print the largest and the 
smallest number using Math.max( ) and Math.min( )*/
import java.util.*;
class prep7
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = Math.max(a,b);
        int s = Math.min(a,b);
        System.out.println("Largest: " +l);
        System.out.println("Smallest: " +s);
    }
}

/*
import java.util.*;
class prep7
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int l = Math.max(a, Math.max(b, c));
        int s = Math.min(a, Math.min(b, c));
        System.out.println("Largest: " +l);
        System.out.println("Smallest: " +s);
    }
}
*/