import java.util.*;
class project8
{
    public static void main(String[]args)
    {
        char ch;
        int a,b;
        double ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for max: ");
        System.out.println("Enter 2 for min: ");
        System.out.println("Enter 3 for power: ");
        System.out.println("Enter your choice: ");
        ch = sc.next().charAt(0);
        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        switch(ch)
        {
            case '1':
            ans = Math.max(a,b);
            System.out.println("The maximum is: " + ans);
            break;
            case '2':
            ans = Math.min(a,b);
            System.out.println("Minimum is: " + ans);
            break;
            case '3':
            ans = Math.pow(a,b);
            System.out.println("Power is: " + ans);
            break;
            default:
            System.out.println("Wrong entry");
        }
    }
}