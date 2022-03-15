/*Write a program to input positive real number and display its Math.ceil()
value. Note that the function Math.ceil() should not be used.*/
import java.util.*;
class lesson7fourteen
{
    public static void main()
    {
        double n, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number: ");
        n = sc.nextDouble();
        c = (int)(n + 0.99999999);
        System.out.println(c);
    }
}