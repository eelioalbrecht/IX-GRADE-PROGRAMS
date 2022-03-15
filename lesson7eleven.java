/*Write a program to input three integers and print the largest and the 
smallest number using Math.max() and Math.min() function.*/
import java.util.*;
class lesson7eleven
{
    public static void main()
    {
        int a, b, c, l, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        l = Math.max(a, Math.max(b, c));
        s = Math.min(a, Math.min(b, c));
        System.out.println("Largest: "+l);
        System.out.println("Smallest: "+s);
    }
}