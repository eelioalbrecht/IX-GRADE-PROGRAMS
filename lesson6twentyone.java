/*Write a program to input the dimensions of a rectangle and find the area of that square whose
perimeter is equal to the perimeter of the rectangle.*/
import java.util.*;
class lesson6twentyone
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float l, b, p, s, a;
        System.out.println("Enter the length and breadth of the rectangle:");
        l = sc.nextFloat();
        b = sc.nextFloat();
        p = 2 * (l + b); 
        s = p / 4; 
        a = s * s;
        System.out.println("Area: " +a);
    }
}