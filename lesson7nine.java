/*Write a program to input the three sides of a triangle and find the 
perimeter and area of the triangle. If a, b and c are the 3 sides then,
Perimeter = a + b + c
Area = √s(s-a)(s-b)(s-c), where s=a+b+c/2*/
import java.util.*;
class lesson7nine
{
    public static void main()
    {
        double a, b, c, s, ar, p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        p = a + b + c;
        s = p / 2;
        ar = Math.sqrt( s * ( s - a ) * ( s - b ) * ( s - c ));
        System.out.println("Area:"+ar);
    }
}