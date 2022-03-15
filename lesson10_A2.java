import java.util.*;
class lesson10_A2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, j, n, s = 0, c, p = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            c = 0;
            for(j = 1; j <= n; j++)
            {
                if(n % j == 0)
                    c++;
            }
            if(c == 2)
            {
                s += n;
                p++;
            }
        }
        if(p > 0)
            System.out.println("Average of prime numbers: " +(float) s / p);
        else
            System.out.println("No prime numbers present");
    }
}