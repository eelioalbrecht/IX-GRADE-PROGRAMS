/*The roots (say x1 and x2) of a quadratic equation ax^2+bx+c=0 can be 
determined by its discriminant (d), where d=b^2-4ac. Depending upon its 
value the nature of the roots and the value of the can be determined.

a. If d=0 then the roots are Real and Equal and the roots can be found 
   using the formula:  −b/2a
b. If d>0 then the roots are Real and Distinct and the roots can be found 
   using. -b±(root)d/2a and -b-(root)d/2a
c. If d<0 then the roots are Imaginary and the roots can be found.
   x1=-d/2a and x2=(root)-d/2*a */
import java.util.*;
class lesson8_39
{
    public static void main(String [] args)
    {
        int a, b, c;
        double d, x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients of the quadratic equation: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = b * b - 4 * a * c;
        System.out.println("Discriminant: "+d);
        if (d < 0) // C    here discriminant is NEGATIVE
        {
            System.out.println("Roots are imaginary");
        }    
        else if(d == 0)// A here discriminant is ZERO
        {
            System.out.println("Roots are real and equal");
            x1 = x2 = (double)b / (2 * a);
            System.out.println("Root 1: "+x1);
            System.out.println("Root 1: "+x2);
        }
        else// B  here discriminant is POSITIVE
        {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root 1: "+x1);
            System.out.println("Root 1: "+x2);
        }
    }
}