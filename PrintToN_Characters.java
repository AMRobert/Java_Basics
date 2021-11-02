import java.util.Scanner;
public class PrintToN_Characters
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int N = input.nextInt();
        System.out.println(str.substring(0,N));
    }
}
