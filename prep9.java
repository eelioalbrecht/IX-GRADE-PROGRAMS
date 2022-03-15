/*Write a program using switch case to find the volume of a cube, a sphere
and a cuboid and an appropriate erroe messahe should be displayed for an 
incorrect choice.
 * Volume of Cube: s*s*s
 * Volume of Sphere: 4/3 pi cubeR
 * Volume of Cuboid: l*b*h
 */
import java.util.*;
class prep9
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("---MENU---");
        System.out.println("A. Volume of Cube\nB. Volume of Sphere\nC. Volume of Cuboid");
        System.out.println("Your Choice: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            case 'A':
                System.out.println("Enter side: ");
                int s = sc.nextInt();
                int cube = s * s * s;
                System.out.println("Volume of Cube: " +cube);
            break;
            case 'b':
            case 'B':
                System.out.println("Enter radius: ");
                int r = sc.nextInt();
                double pi = 3.14;
                double sphere = 4 / 3 * pi * Math.cbrt(r); 
                System.out.println("Volume of Sphere: " +sphere);
            break;
            case 'c':
            case 'C':
                System.out.println("Enter length: ");
                int l = sc.nextInt();
                System.out.println("Enter breadth: ");
                int b = sc.nextInt();
                System.out.println("Enter height: ");
                int h = sc.nextInt();
                int cuboid = l * b * h;
                System.out.println("Volume of Cuboid: " +cuboid);
        }
        System.out.println("\n----------");
    }
}