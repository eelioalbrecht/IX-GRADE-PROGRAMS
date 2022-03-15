import java.util.*;
class project10
{
    public static void main(String[]args)
    {
        int G,F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight of groceries: ");
        G = sc.nextInt();
        System.out.println("Enter weight of fruits: ");
        F = sc.nextInt();
        if(G>=10 && F>=8)
        System.out.println("A chocolate cake");
        else if(G>=7 && F>=5)
        System.out.println("A vanilla cake");
        else if(G>=4 && F>=2)
        System.out.println("A fruit juice bottle");
        else
        System.out.println("Not applicable");
    }
}