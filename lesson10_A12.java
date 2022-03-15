import java.util.*;
class lesson10_A12
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int d, s, n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        do
        {
            s = 0;
            while(n > 0)
            {
                d = n%10;
                s += d * d;
                n /= 10;
            }
            n = s;
        }while(n > 9);
        if(n == 1)
            System.out.println("Happy Number");
        else
            System.out.println("Not a Happy Number");
    }
}