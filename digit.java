import java.util.*;
class digit
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, d, rev = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        while (n >0)
        {
            d = n % 10;
            rev = rev * 10 + d;
            n/= 10;
        }
        System.out.println(rev+" ");
    }
}