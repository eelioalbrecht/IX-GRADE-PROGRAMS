import java.util.*;
class palindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, t, rev = 0, d;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        t = n;
        while (t != 0)
        {
            d = t % 10;
            rev = rev * 10 + d;
            t /= 10;
        }
        if(rev == n)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Plaindrome Number");
    }
}