import java.util.*;
class chORdig
{
    public static void main(String [] args)
    {
        char input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        input = sc.next().charAt(0);
        if((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
            System.out.println("Input is an Alphabet");
        else if (input >= '0' && input <= '9')
            System.out.println("Input is a Number");
        else
            System.out.println("Input is a Special Character");
    }
}