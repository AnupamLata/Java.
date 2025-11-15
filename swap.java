import java.util.Scanner;
public class swap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome");
        System.out.print("Enter the value of A:");
        int a = input.nextInt();
        System.out.print("Enter the value of B:");
        int b = input.nextInt();
        int c = a;
        a = b ;
        b = c;
        System.out.println("Done");
        System.out.println("value of A is:" +a);
        System.out.println("value of B is:" +b);
    }
}
