import java.util.Scanner;
public class CovertToUpperLowerCase
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String S = input.next();
        String Lower = S.toLowerCase();
        String Upper = S.toUpperCase();
        System.out.println(Lower);
        System.out.println(Upper);
    }
}
