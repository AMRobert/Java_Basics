import java.util.Scanner;
public class Print_N_Times_String
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int N = input.nextInt();
        System.out.println(str.repeat(N));
    }
}
