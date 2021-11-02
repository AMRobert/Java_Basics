import java.util.Scanner;
public class Equal_IgnoreCase
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
