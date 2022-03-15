import java.util.*;
class lesson10_A6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, j, n, s = 0, c, p = 0;
        System.out.println("Enter 10 integers: ");
        for (i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            c = 0;
            for (j = 1; j < n; j++)
            {
                if(n % j == 0)
                    c += j;
            }
            if(c == n)
            {
                p++;
                if(p == 1)
                    s = n;
                if (n < s)
                    s = n;
            }
        }
        if(p > 0)
            System.out.println("Smallest perfect numbers: " +s);
        else
            System.out.println("No perfect numbers present");
    }
}