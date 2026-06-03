import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();

        int i, fact=1;
        if(num<0){
            System.out.println("Factorial is not possible in this condition:");
        }else{
            for(i=1;i<=num;i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }
        input.close();
    }
    
}