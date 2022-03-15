/*Write a program that outputs the results of the following evaluations based 
on the number entered by the user.
i. Cube root of the number
ii. Absolute value of the number
iii. Square root of the number
iv. Random numbers between 0 and 1.*/
import java.util.*;
class lesson7three
{
    public static void main()
    {
        double n, c, a, s, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextDouble();
        c = Math.cbrt(n);
        a = Math.abs(n);
        s = Math.sqrt(n);
        r = Math.random();
        System.out.println("Cube Root: "+c);
        System.out.println("Absolute: "+a);
        System.out.println("Square Root: "+s);
        System.out.println("Random number: "+r);
    }
    void cal()
    {
        lesson7three obj = new lesson7three();
        obj.cal();
    }
}