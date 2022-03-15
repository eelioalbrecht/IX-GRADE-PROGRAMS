import java.util.*;
class project2
{
    static int consumernumber, prevmeter, presmeter,units;
    static String month,name;
    static double bill;
    void unitcal()
    {
        units = presmeter - prevmeter;
    }
    void chargecal()
    {
        if(units <= 100)
        bill = 100 + units * 1.20;
        else if(units >= 101 && units <= 220)
        bill = 100 + (100 * 1.20) + ((units - 100) * 1.75);
        else
        bill = 100 + (100 * 1.20) + (120 * 1.75) + ((units - 220) * 2.25);
    }
    public static void main(String[]args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Consumer Name: ");
        name = sc.nextLine();
        System.out.println("Enter the month: ");
        month = sc.next();
        System.out.println("Enter consumer number: ");
        consumernumber = sc.nextInt();
        System.out.println("Enter your previous meter reading: ");
        prevmeter = sc.nextInt();
        System.out.println("Enter your present meter reading: ");
        presmeter = sc.nextInt();
        project2 obj = new project2(); 
        obj.unitcal();
        project2 obj2 = new project2();
        obj2.chargecal();
        System.out.println("Consumer Name: " + name);
        System.out.println("Month: " + month);
        System.out.println("Consumer Number: " + consumernumber);
        System.out.println("Previous Meter Reading: " + prevmeter);
        System.out.println("Present Meter Reading: " + presmeter);
        System.out.println("Units: " + units);
        System.out.println("Total amount to be paid: " + bill);
    }
}