import java.util.*;
class final7
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double weight;
        System.out.println("PARCELS FROM DELHI TO KOLKOTA or VICE VERSA");
        System.out.println("Enter the Weight of the Parcel: ");
        weight = sc.nextDouble();
        double ch;
        if(weight <= 10)
            ch = weight * 20;
        else if(weight > 10 && weight <= 30)
            ch = (weight * 20) + (weight - 10) * 10;
        else if(weight >30 && weight <= 50)
            ch = (weight * 20) + (weight * 10) + (weight - 30) * 8;
        else
            ch = (weight * 20) + (weight * 10) + (weight * 8) + (weight - 50) * 5;
        System.out.println("Charge for Parcel: " +ch);
    }
}