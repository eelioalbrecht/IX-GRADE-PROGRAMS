/*Write a program to enter the length and area of a rectangle and find its perimeter.
For Example,
INPUT:
  Enter the length of the rectangle:12
  Enter the area of the rectangle: 72
OUTPUT:
  Perimeter of the rectangle:36.0*/
import java.util.*;
class lesson6nineteen
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float l, b, a, p;
        System.out.println("Enter the length of the rectangle:");
        l = sc.nextFloat();
        System.out.println("Enter the area of the rectangle:");
        a = sc.nextFloat();
        b = a / l;
        p = 2 * (l + b);
        System.out.println("Perimeter of the rectangle: " +p);
    }
}