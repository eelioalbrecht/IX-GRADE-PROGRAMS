/*Write a program to input positive real number and display its Math.floor()
value. Note that the function Math.floor( ) should not be used.*/
import java.util.*;
class lesson7seventeen
{
    public static void main()
    {
        double n, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextDouble();
        f = (int)n;
        System.out.println(f);
    }
}