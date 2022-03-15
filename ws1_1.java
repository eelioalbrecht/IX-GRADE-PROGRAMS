import java.util.*;
class ws1_1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, s = 0;
        System.out.println("Enter an integer: ");
        n = sc.nextInt();
        for(i = 1; i < n; i++)
        {
            if(n % i == 0)
                s += i;
        }
        if(s == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}