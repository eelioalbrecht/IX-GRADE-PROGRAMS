/*Question*/
import java.util.*;
class final8
{
    void calculate()
    {
        Scanner sc = new Scanner(System.in);
        int i, s = 0, p = 1, a;
        System.out.println("Enter 10 number");
        for(i = 1; i <= 10; i++)
        {
            a = sc.nextInt();
            if(a % 2 == 0)
                s += a;
            else
                p *= a;
        }
        System.out.println("Sum: " +s);
        System.out.println("Product: " +p);
    }
    public static void main(String [] args)
    {
        final8 obj = new final8();
        obj.calculate();
    }
}