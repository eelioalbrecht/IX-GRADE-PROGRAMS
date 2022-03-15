/*17.3.2021*/
//Find AREA OF RECTANGLE.
class AREA_RECT
{
    void area()
    {
        int l, h;
        l = 13;
        h = 10;
        int area = l * h;
        System.out.println("The Area of the Rectangle is: " + area);
    }
    public static void main()
    {
        AREA_RECT R = new AREA_RECT();
        R.area();
    }
}