/*Write a program to input the area of a circle and find its circumference.*/
import java.util.*;
class lesson7five
{
    public static void main()
    {
        double c, a, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of the circle:");
        a = sc.nextDouble();
        r = Math.sqrt(a * 7/22);
        c = 2 * 22 / 7.0 * r;
        System.out.println("Circumference:"+c);
    }
}