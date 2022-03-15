/*Write a menu driven program to find:
a. Area of a rectangle, where length and breadth is taken as input.
(Area=length *breadth)
b. Area of a circle, where radius is taken as input.
(Area= 22/7*radius2)*/
import java.util.*;
class lesson8_28
{
    public static void main(String [] args)
    {
        int ch, a, l, b;
        float ar, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1.Area of a rectangle");
        System.out.println("2.Area of a circle");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the length and breadth of a rectangle: ");
            l = sc.nextInt();
            b = sc.nextInt();
            a = l * b;
            System.out.println("Area: "+a);
            break;
            case 2:
            System.out.println("Enter the radius of a circle: ");
            r = sc.nextFloat();
            ar = 22 / 7f * r * r;
            System.out.println("Area: "+ar);
            break;
            default:
            System.out.println("Invalid choice");
        }
    }
}