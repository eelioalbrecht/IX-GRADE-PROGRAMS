//write a program by using a classname "Picinc" without any data members but having only functions as per the specifications given below:
//classname- Picnic
/* void display1(): to print venue, reporting time
 * void display2(): print number of students, name of the teacher accompanying 
 *                     and bus number
 * write main method to creat an object of class picinc and call the function
 * display1 and display2
 */  

class Picnic
{
    void display1()
    {
        System.out.println("Venue: Mysore ");
        System.out.println("Reporting Time: 06:00 ");
        System.out.println("Time: 06:00 - 19:00");
    }
    void display2()
    {
        System.out.println("Number of Students: 50");
        System.out.println("Name of the Teacher(s): Latha Menta, Anuradha CJ");
        System.out.println("Bus Number: 15- KA 05 MN 2775");
    }
    public static void main(String [] args)
    {
        Picnic d1 = new Picnic();
        Picnic d2 = new Picnic();
        d1.display1();
        d2.display2();
    }
}