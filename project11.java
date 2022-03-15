import java.io.*;
import java.util.*;
import java.io.IOException;
import java.text.DecimalFormat;

class project11
{
    String name, coach;
    int amt, totalAmt;
    double moblienumber;
    void accept() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger's Name: ");
        name = sc.nextLine();
        System.out.println("Enter Mobile Number: ");
        moblienumber = sc.nextDouble();
        System.out.println("Enter Coach (FirstAC/SecondAC/ThirdAC/sleeper):");
        coach = sc.next();
        System.out.println("Enter basic amount of ticket: ");
        amt = sc.nextInt();
    }
    
    void update()
    {
        if (coach.equals("First_AC"))
            totalAmt = amt + 700;
        else if (coach.equals("Second_AC"))
            totalAmt = amt + 500;
        else if (coach.equals("Third_AC"))
            totalAmt = amt + 250;
        else
        totalAmt = amt;
    }
    
    void display()
    {
        System.out.println("Name: " +name);
        System.out.println("Coach: " +coach);
        System.out.println("Total Amount: " +totalAmt);
        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Mobile Number: " +ft.format(moblienumber));
    }
    
    public static void main(String args []) throws IOException
    {
        project11 t = new project11();
        t.accept();
        t.update();
        t.display();
    }
}
