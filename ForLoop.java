import java.util.Scanner;
public class ForLoop {

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i=a;i<=b;i++)
            {
                System.out.print(i+"\t");
            }
        System.out.println();
        for(int j=b;j>=a;j--)
        {
            System.out.print(j+"\t");
        }
        }

    }
