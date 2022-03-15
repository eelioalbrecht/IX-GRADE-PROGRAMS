import java.util.*;
class lesson10_A
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, j, n, s = 0, c;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i <= 10; i++)
        {
            n = sc.nextInt();
            c = 0;
            for(j = 1; j <= n ; j++)
            {
                if(n % j == 0)
                    c++;
            }
            if(c == 2)
                s += n;
        }
        System.out.println("Sum of prime numbers: " +s);
    }
}