/*Write a program to input the Principal, Rate and Time for a certain amount of money and
print the Simple Interest.
Note:
SI=P*T*R/100*/
import java.util.*;
class lesson6five
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        float p,r,t,si;
        System.out.println("Enter the principal:");
        p = sc.nextFloat();
        System.out.println("Enter the rate:");
        r = sc.nextFloat();
        System.out.println("Enter the time:");
        t = sc.nextFloat();
        si = (p*r*t)/100;
        System.out.println("Simple Interest="+si);
    }
}