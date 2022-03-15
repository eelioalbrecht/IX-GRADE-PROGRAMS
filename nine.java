/*Write a program using int variable to find the area and the perimeter of a reactangle of length 12cm and breadth 8cm*/
class nine
{
    public static void main()
    {
        float l, b;
        l = 12.0f;
        b = 8.0f;
        float perimeter = 2 * (l + b);
        float area = l * b;
        System.out.println("Perimeter: " +perimeter);
        System.out.println("Area: " +area);
    }
}