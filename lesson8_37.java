/*To foster a sense of water conservation, the water department has an 
annual water conservation tax policy. The tax are based on the water 
consumption of the consumer. The tax rates are as follows:
*Water Consumed (in Gallons)*            *Tax Rate in ₹ /100 gallons*
1. Upto 45                                            No Tax
2. More than 45 but 75 or less                        475.00
3. More than 75 but 125 or less                       750.00
4. More than 125 but 200 or less                     1225.00
5. More than 200 but 350 or less                     1650.00
6. More than 350                                     2000.00
Write a program to input the water consumed annually in gallons and output
the tax payable.*/
import java.util.*;
class lesson8_37
{
    public static void main(String [] args)
    {
        int g;
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the water consumed annualy in gallons: ");
        g = sc.nextInt();
        if (g <= 45)
            tax = 0;
        else if(g > 45 && g <= 75)
            tax = g / 100f * 475;
        else if(g > 75 && g <= 125)
            tax = g / 100f * 750;
        else if(g > 125 && g <= 200)
            tax = g / 100f * 1225;
        else if(g > 200 && g <= 350)
            tax = g / 100f * 1650;
        else
            tax = g / 100f * 2000;
        System.out.println("Tax Payable: "+tax);
    }
}