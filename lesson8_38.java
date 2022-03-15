/*Write a program to input the length of the 3 sides of a triangle 
(say a, b and c) and calculate the area depending upon the following
criteria:
i. If the sum of any two sides of the triangle is lesser than the third 
   side then print “A triangle cannot be formed�?
ii. If a=b=c then print “It is an equilateral triangle�? and calculate 
    the area as area = {(root)3}/2*a*a
iii. If the sum of the squares of any two sides is equal to the square 
    of the third side then print “It is a right-angled triangle�? and 
    calculate the area as area= 1/2*product of the perpendicular sides
iv. otherwise calculate area as area= where {(root)s(s − a) (s − b) (s − c)}

s = a+b+c/2*/
import java.util.*;
class lesson8_38
{
    public static void main(String [] args)
    {
        int a, b, c;
        double ar, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of the triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a < b + c && b < c + a && c < a + b)
        {
            if (a == b && b == c)
                ar = Math.sqrt(3) / 2 * a * a;
            else if(a * a == b * b + c * c)
                ar = 1 / 2.0 * (b * c);
            else if(b * b == a * a + c * c)
                ar= 1 / 2.0 * (a * c);
            else if(c * c == b * b + a * a)
                ar=1 / 2.0 * (b * a);
            else
            {
                s = (a + b + c) / 2.0;
                ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            }
            System.out.println("Area: "+ar);
        }
        else
            System.out.println("A triangle cannot be formed");
    }
}