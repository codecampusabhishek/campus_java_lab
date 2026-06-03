import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the divisor: ");
        int a = input.nextInt();
        System.out.println("Enter the divider:");
        int b = input.nextInt();

        int hcf = 1, i;
        int limit;
        if(a<b){
            limit = a;
        }else{
            limit = b;
        }

        for(i=1; i<=limit;i++){
            if(a%i==0 && b%i==0){
                hcf =i;
            }
            
        }
        System.out.println("HCF ="+ hcf);
        input.close();
    }
}