/*18.3.2021*/
//CLASSWORK: WAP to calculate KE and creat an object.
class KE
{
    void energy()
    {
        double KE;
        int m, v;
        m = 32;
        v = 20;
        KE = 0.5 * m * v * v;
        System.out.println("KE = " + KE);
    }
    public static void main()
    {
        KE E = new KE();
        E.energy();
    }
}