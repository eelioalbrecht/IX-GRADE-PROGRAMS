import java.util.*;
class lesson9_17
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, f = 0, m = 0;
        System.out.println("Enter 10 integers: ");
        for(i = 1; i<=10; i++)
        {
            n = sc.nextInt();
            if(i == 1)
                m = n;
            if( n != m)
                f = 1;
        }
        if(f == 0)
            System.out.println("All numbers are same");
        else
            System.out.println("All numbers are not same");
    }
}