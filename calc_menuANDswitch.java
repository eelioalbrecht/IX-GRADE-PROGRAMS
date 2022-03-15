import java.util.*;
class calc_menuANDswitch
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a1, b1, c1, pro = 1;
        System.out.println("---MENU---");
        System.out.println("A. Add the integers");
        System.out.println("S. Subtract the integers");
        System.out.println("D. Divide the integers");
        System.out.println("M. Multiply the integers");
        System.out.println("R. Remainder of the division");
        System.out.println("----------");
        System.out.println("Your Choice: ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the two digits: ");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        switch(ch)
        {
            case 'A':
            case 'a':
                c1 = a1 + b1;
                System.out.println("Sum: " +c1);
            break;
            case 'S':
            case 's':
                c1 = (a1 > b1)?a1-b1:b1-a1;
                System.out.println("Difference: " +c1);
            break;
            case 'M':
            case 'm':
                pro = a1 * b1;
                System.out.println("Product: " +pro);
            break;
            case 'D':
            case 'd':
                c1 = (a1>b1)?a1/b1:b1/a1;
                System.out.println("Quotient: " +c1);
            break;
            case 'R':
            case 'r':
                c1 = (a1>b1)?a1%b1:b1%a1;
                System.out.println("Quotient: " +c1);
            break;
            default:
                System.out.println("!Wrong Choice! Type A, S, R, M, D");
        }
    }
}