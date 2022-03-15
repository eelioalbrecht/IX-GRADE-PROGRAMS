/*16.3.2021
Find AREA OF CIRCLE.*/
class AREA_CIRCLE
{
    void pie()
    {
        double a = 3.14;
        int r = 13;
        double b = a * r * r;
        System.out.println("The Area of the Circle is: " + b);
    }
    public static void main()
    {
        AREA_CIRCLE C = new AREA_CIRCLE();
        C.pie();
    }
}