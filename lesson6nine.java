/*Write a program to input the radius and height of a cylinder and find its volume and total
surface area.
Note: Total Surface Area=22 + 2h
Volume=2h*/
import java.util.*;
class lesson6nine
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float r, h, v, a, pi = 3.142f;
        System.out.println("Enter the radius:");
        r = sc.nextFloat();
        System.out.println("Enter the height:");
        h = sc.nextFloat();
        v = pi * r * r * h;
        a = 2 * pi * r * r + 2 * pi * r * h;
        System.out.println("Volume=" +v);
        System.out.println("Area=" +a);
    }
}