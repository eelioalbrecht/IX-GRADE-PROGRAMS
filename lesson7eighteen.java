/*Write a program to generate 2 random integers between 10 to 99 
(both inclusive) and find their sum, product and difference.*/
import java.util.*;
class lesson7eighteen
{
    public static void main()
    {
        int r1, r2, s, d, p;
        r1 = 10 + (int)(Math.random() * (99 - 10 + 1));
        r2 = 10 + (int)(Math.random() * (99 - 10 + 1));
        s = r1 + r2;
        d = r1 - r2;
        p = r1 * r2;
        System.out.println("Sum: "+s);
        System.out.println("Difference: "+d);
        System.out.println("Product: "+p);
    }
}