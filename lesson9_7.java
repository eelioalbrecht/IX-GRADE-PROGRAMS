import java.util.*;
class lesson9_7
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, n, c = 0;
        System.out.println("Enter an Interger: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i+=2)
        {
            if(n % i == 0)
                c++;
        }
        System.out.println("Number of Factors: " +c);
    }
}