import java.util.*;
class perfect
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, i = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        i = n;
        while (i <= n/2)
        {
            if(n % i == 0)
                sum += i;
            i++;
        }
        if(n == sum)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}