import java.util.*;
class lesson9_15
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0, l = 0, p = 0, s = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            if(n % 2 == 0)
            {
                c++;
                if(c == 1)
                    l = n;
                if(n > l)
                    l = n;
            }
            else
            {
                p++;
                if(p == 1)
                    s = n;
                if(n < s)
                    s = n;
            }
        }
        if(c > 0)
            System.out.println("Largest even number: " +l);
        else
            System.out.println("No even integer found");
        if(p > 0)
            System.out.println("Smallest odd number: " +s);
        else
            System.out.println("No odd integer found");
    }
}