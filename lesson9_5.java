import java.util.*;
class lesson9_5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, f = 1, n;
        System.out.println("Enter an Integer: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            f = f * i;
        }
        System.out.println("Factorial: " +f);
    }
}