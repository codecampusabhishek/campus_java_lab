import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int num = input.nextInt();

       int i, fact = 1;
       if(num < 0){
        System.out.println("The Factorial is not possible: ");
       }
       else{
        for(i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+"is = "+fact);
       }
       input.close();
    }
}