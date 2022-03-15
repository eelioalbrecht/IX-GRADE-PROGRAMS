/*Write a program to input the 3 sides of a triangle and find the perimeter
and area of a triangle if a, b, c are the 3 sides then,
 * Perimeter = a + b + c
 * Area = ?(s(s-a)(s-b)(s-c)); s = (a + b + c) / 2
 */
import java.util.*;
class prep6
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = ((a + b + c) / 2);
        double P = a + b + c;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: " +area);
        System.out.println("Perimeter: " +P);
    }
}