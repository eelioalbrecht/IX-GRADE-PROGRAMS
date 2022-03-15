import java.util.*;
class ws1_8
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, n, i;
        double S = 0;
        //System.out.println("(X+1)² + (X+2)³ + (X+3)? + (X+4)? +...+ (X+N)??¹");
        System.out.println("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for(i = 1; i <= n; i++)
        {
            S = Math.pow(x + 1, 2) + Math.pow(x + 2, 3) + Math.pow(x + 3, 4) + Math.pow(x + 4, 5) + Math.pow(x + n, n + 1);
        }
        System.out.println("Sum: " +S);
    }
}