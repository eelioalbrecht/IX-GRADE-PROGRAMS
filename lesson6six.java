/*Write a program to input the length and breadth of a rectangle and find its area and perimeter.
Note: Area of a rectangle=length*breadth
Perimeter of a rectangle=2*(length+breadth)*/
import java.util.*;
class lesson6six
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float l, b, a, p;
        System.out.println("Enter the length: ");
        l = sc.nextFloat();
        System.out.println("Enter the breadth: ");
        b = sc.nextFloat();
        a = l*b;
        p = 2*(l+b);
        System.out.println("Area= "+a);
        System.out.println("Perimeter= "+p);
    }
}