import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Lower limit: ");
        int low = input.nextInt();
        System.out.println("Enter the upper limit:");
        int high = input.nextInt();

        if(low < 2){
            low = 2;
        }

        int num, i, flag;
        for(num =low;num<=high;num++){
            flag =0;
            for(i=2;i<=num-1;i++){
                if(num%i==0){
                    flag =1;
                    break;
                }
            }
            if(flag == 0){
            System.out.println(num+"Is a prime number");
            }
        
        }
        input.close();
    }
}