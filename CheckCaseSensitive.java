import java.util.Scanner;
public class CheckCaseSensitive
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        if(str1.equals(str2))
        {
            System.out.println("Case Sensitive");
        }
        else
        {
            System.out.println("Not a Case Sensitive");
        }
    }
}
