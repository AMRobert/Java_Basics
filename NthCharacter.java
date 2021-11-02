import java.util.Scanner;
public class NthCharacter
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
String str = input.next();
int N = input.nextInt();
char Nth_Pos = str.charAt(N-1);
System.out.println(Nth_Pos);
}
}
