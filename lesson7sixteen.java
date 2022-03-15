/*Write a program to input three numbers and find the average of their cube 
roots.*/
import java.util.*;
class lesson7sixteen
{
    public static void main()
    {
        double a, b, c, av;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        av = (Math.cbrt(a)+Math.cbrt(b)+Math.cbrt(c))/3;
        System.out.println("Average: "+av);
    }
}