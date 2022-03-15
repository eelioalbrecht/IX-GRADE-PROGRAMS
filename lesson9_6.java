import java.util.*;
class lesson9_6
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter an Integer: ");
        n = sc.nextInt();
        System.out.println("Factors: ");
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                System.out.print(i+" ");
        }
    }
}