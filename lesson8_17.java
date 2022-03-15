/*SLAB_RATE*/
/*An electricity company charges their consumers according to the units 
consumed per month according to the given traffic:

Units Consumed                                   Charges
1. Up to 100 units                                ₹2 per unit
2. More then 100 units and up to 200 units        ₹1.80 per unit
3. More then 200 units                            ₹1.50 per unit

In addition to the above, every consumer has to pay ₹ 200 as Service Charge 
per month. Write a program to input the amount of units consumed and 
calculate the total charges payable(Bill) by the consumer.*/
import java.util.*;
class lesson8_17
{
    public static void main(String [] args)
    {
        float u, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units consumed: ");
        u = sc.nextInt();
        if(u <= 100)
            c = 2 * u;
        else if(u <= 200)
            c = 100 * 2 + (u - 100) * 1.8f;
        else 
            c = 100 * 2 + 100 * 1.8f + (u - 200) * 1.50f;
        c = 200 + c;
        System.out.println("Amount Payable: "+c);
    }
}