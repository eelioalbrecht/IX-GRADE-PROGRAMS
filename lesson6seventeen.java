/*Write a program to input three integers and find their sum, without using the 
mathematical
operator +.*/
import java.util.*;
class lesson6seventeen
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c, s;
        System.out.println("Enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = a - (-b) - (-c);
        System.out.println("Sum: " +s);
    }
}