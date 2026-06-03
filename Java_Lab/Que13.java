import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        int  digit, rev = 0;
        while(num>0){
            digit = num%10;
            rev = digit +rev*10;
            num = num/10;
        }
        System.out.println(rev);
        input.close();
    }
    
}