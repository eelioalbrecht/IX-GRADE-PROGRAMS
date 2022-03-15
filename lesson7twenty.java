/*Write a program to input three integers and find the sum of the cube 
roots of their last digits.*/
import java.util.*;
class lesson7twenty
{
    public static void main()
    {
        double s;
        int a, b, c, l1, l2, l3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        l1 = a % 10;
        l2 = b % 10;
        l3 = c % 10;
        s = Math.cbrt(l1) +Math.cbrt (l2) +Math.cbrt(l3);
        System.out.println("Sum: "+s);
    }
}