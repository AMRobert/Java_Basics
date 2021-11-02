import java.util.Scanner;
public class ReplaceChar
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char ch1 = input.next().charAt(0);
        char ch2 = input.next().charAt(0);
        System.out.println(str.replace(ch1,ch2));
    }
}
