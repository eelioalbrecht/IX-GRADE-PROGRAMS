import java.util.*;
class mid2
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        
        if (a == b && b == c) 
            System.out.println("All the numbers are equal");
        else
        {
            int g = a;
            if (b > g)
                g = b;
            if (c > g)
                g = c;
            System.out.println("Greatest number: " + g);
        }
    }
}