import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = input.nextInt();
        System.out.println("Enter the b: ");
        int b = input.nextInt();

       a = a+b;
       b = a-b;
       a = a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        input.close();
    }
}