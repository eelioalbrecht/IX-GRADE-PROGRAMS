import java.util.*;
class ws1_6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n, i, f = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(i = 1; i * (i + 1) <= n; i++)
        {
            if(i * (i + 1) == n)
            {
                System.out.println("Pronic Number");
                f = 1;
            }
        }
        if(f == 0)
            System.out.println("Not a pronic number");
    }
}