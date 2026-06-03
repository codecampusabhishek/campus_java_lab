import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (num <= 1) {
            System.out.println("Not a prime number");
            input.close();
            return;
        }

        int flag = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        input.close();
    }
}
