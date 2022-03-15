    import java.util.*;
class justAutomorphicInWhile
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double n, c = 0;
        System.out.println("Enter a number");
        n = sc.nextDouble();
        double sq = Math.pow(n, 2);
        int temp = (int) n;
        while (temp > 0)
        {
            c++;
            temp /= 10;
        }
        /*
        for (temp > 0; c++)
        {
            temp /= 10;
        }
        */
        int d = (int) (sq % (Math.pow(10, c)));
        if(n == d)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
}