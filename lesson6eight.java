/*Write a program to input the length, breadth and height of a cuboid and find its Volume and
Total Surface Area.
Note: Volume of a cuboid= length*breadth*height
Total Surface Area=2*(length*breadth+breadth*height+height*length)*/
import java.util.*;
class lesson6eight
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float l, b, h, v, a;
        System.out.println("Enter the length:");
        l = sc.nextFloat();
        System.out.println("Enter the breadth:");
        b = sc.nextFloat();
        System.out.println("Enter the height:");
        h = sc.nextFloat();
        v = l * b * h;
        a = 2 * (l * b + b * h + h * l);
        System.out.println("Volume="+v);
        System.out.println("Area="+a);
    }
}