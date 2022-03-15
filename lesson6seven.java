/*Write a program to input the radius of a circle and find its area and perimeter.
Note: Area of a circle=22/7* radius2
Circumference of a circle= 2 * 22/7 * radius*/
import java.util.*;
class lesson6seven
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float r, a ,pi=3.142f, c;
        System.out.println("Enter the radius:");
        r = sc.nextFloat();
        a = pi*r*r;
        c = 2*pi*r;
        System.out.println("Area="+a);
        System.out.println("Circumference=" +c);
    }
}