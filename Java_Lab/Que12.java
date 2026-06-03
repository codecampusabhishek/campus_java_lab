import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();

        int i,sum = 0,digit;
        for(i=0;i<=a; i++){
            digit = a%10;
            sum = sum + digit;
            a = a/10;
        }
        System.out.println(sum);
        input.close();
    }
    
}