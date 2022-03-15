/*Write a program to input 3 integers and find the difference between their sum and average*/
import java.util.*;
class lesson6four
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,s;
        float av,d;
        System.out.println("Enter 3 integers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=a+b+c;
        av=s/3f;
        d=s-av;
        System.out.println("Difference="+d);
    }
}