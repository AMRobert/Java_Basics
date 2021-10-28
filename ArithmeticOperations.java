import java.util.Scanner;
public class ArithmeticOperations {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int a,b,sum,sub,mul,div,mod;
    System.out.print("Value of a = ");
    a = sc.nextInt();
    System.out.print("Value of b = ");
    b = sc.nextInt();
    sum = a+b;
    sub = a-b;
    mul = a*b;
    div = a/b;
    mod = a%b;
    System.out.println("The Addition of " + a + " + " + b + "  = "+sum);
    System.out.println("The Subtraction of " + a + " - " + b + "  = "+sub);
    System.out.println("The Multiplication of " + a + " * " + b + "  = "+mul);
    System.out.println("The Division of " + a + " / " + b + "  = "+div);
    System.out.println("The Modulus of " + a + " % " + b + "  = "+mod);
    }
}
