/*Write a program to input the length and breadth of a rectangle and 
find the perimeter of that square whose area is same as the area of the 
rectangle.*/
import java.util.*;
class lesson7nineteen
{
    public static void main()
    {
        double l, b, a, s, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
        a = l * b;
        s = Math.sqrt(a);
        p = 4 * s;
        System.out.println("Perimeter: "+p);
    }
}