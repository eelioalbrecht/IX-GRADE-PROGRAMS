import java.util.Scanner;
class unicode
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int u;
        char c;
        System.out.println("Enter A Character: ");
        c = sc.next().charAt(0);
        u = (int)c;
        System.out.println("Unicode: "+u);
    }
}