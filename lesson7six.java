/*Write a program to input three intergers and find the sum of their cube roots*/
import java.util.*;
class lesson7six
{
    public static void main()
    {
        double s;
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = Math.cbrt(a) + Math.cbrt(b) + Math.cbrt(c);
        System.out.println("Sum:" +s);
    }
}