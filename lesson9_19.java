import java.util.Scanner;
class lesson9_19
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, se = 0, so = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            if(n % 2 == 0)
                se += n;
            else 
                so += n;
        }
        System.out.println("Sum of Even Numbers:" +se);
        System.out.println("Sum of Odd Numbers:" +so);
    }
}