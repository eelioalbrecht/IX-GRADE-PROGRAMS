/*Write a program to input two integers say x and y and find the sum of the 
following series.
*/
import java.util.*;
class lesson9_21
{
    static void i()
    {
        int i, x, n;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and n: ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            s =s + Math.pow(x, i) / i;
        }
        System.out.println("Sum: " +s);
    }
    
    static void ii()
    {
        int i, x, n;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and n: ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            s = s + Math.pow(x, i) / (i + 1);
        }
        System.out.println("Sum: " +s);
    }
    
    static void iii()
    {
        int i, x, n;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and n: ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
        s = s + Math.pow(x, i + 1) / i;
        }
        System.out.println("Sum: " +s);
    }
    
    static void iv()
    {
        int i, x, n;
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and n: ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            s = s + Math.pow(x, i + 1) / i;
        }
        System.out.println("Sum: " +s);
    }
    
    static void v()
    {
        int i, x, n;
        double s =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x and n: ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            s = s  +Math.pow(x, i) / i;;
        }
        System.out.println("Sum: " +s);
    }
    
    public static void main(String[] args)
    {
        lesson9_21 A = new lesson9_21();
        A.i();
        lesson9_21 B = new lesson9_21();
        B.ii();
        lesson9_21 C = new lesson9_21();
        C.iii();
        lesson9_21 D = new lesson9_21();
        D.iv();
        lesson9_21 E = new lesson9_21();
        E.v();
    }
}