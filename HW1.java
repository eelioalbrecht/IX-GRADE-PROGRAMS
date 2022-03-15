/*Write a program that outputs the result of the following
evaluations based on the number entered by the user.
i) Absolute value of any number
ii) Square root of any number
iii) Cube root of any number*/
import java.util.*;
class HW1
{
    public static void main(String args[])
    {
        double n, c, a, s, r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextDouble();
        c = Math.cbrt(n);
        a = Math.abs(n);
        s = Math.sqrt(n);
        System.out.println("(i) Absolute: "+a);
        System.out.println("(ii)Square Root: "+s);
        System.out.println("(iii)Cube Root: "+c);
    }
    void homework()
    {
        HW1 obj = new HW1();
        obj.homework();
    }
}