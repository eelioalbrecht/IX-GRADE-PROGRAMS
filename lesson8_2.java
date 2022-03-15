/*Write a program to input the Selling Price and Cost Price of a 
commodity and find the Profit or Loss made upon selling the product.
For example,
INPUT:
Enter the Selling Price of the commodity: 456
Enter the Cost Price of the commodity: 400
OUTPUT:
Profit: 56
INPUT:
Enter the Selling Price of the commodity: 300
Enter the Cost Price of the commodity: 310
OUTPUT:
Loss: 10*/

import java.util.*;
class lesson8_2
{
    public static void main()
    {
        int sp, cp, ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Selling Price of the commodity: ");
        sp = sc.nextInt();
        System.out.println("Enter the Cost Price of the commodity: ");
        cp = sc.nextInt();
        if(sp > cp)
        {
            ans = sp - cp;
            System.out.println("Profit: "+ans);
        }
        else if(sp < cp)
        {
            ans = cp - sp;
            System.out.println("Loss: "+ans);
        }
        else
            System.out.println("No profit or loss");
    }
}