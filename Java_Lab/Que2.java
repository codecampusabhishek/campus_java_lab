import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a % 4 == 0) {
            System.out.println("that year is leap year!!");
        }
        else{
            System.out.println("Yrr ye leap year nhi hai!!");
        }
        input.close();
    }
}