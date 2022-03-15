/*Write a program using variables to find the area and circumference of a circle whose radius if 12cm*/
/*Note that:
Area of a circle = π r2
Circumference of a circle = 2π r;*/
class twelve
{
    public static void main()
    {
        int r = 12;
        float pi = 3.14f;
        float area = pi * r * r;
        float cir = 2 * pi * r;
        System.out.println("Circumference: " +cir);
        System.out.println("Area: " +area);
    }
}