import java.util.Scanner;

public class Que10 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("ENter the number: ");
        int a = input.nextInt();

        int i;
        for(i=1;i<=10;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
        input.close();
    }
}