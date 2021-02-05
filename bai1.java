import java.util.Scanner;

public class bai1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a number:");
        int inputNumber=scanner.nextInt();
        int endCheck= (int) Math.sqrt(inputNumber);
        int count=0;
        if(inputNumber<=1){
            System.out.println("khong la so nguyen to");
        }else{
            for(int i=2;i<endCheck;i++){
                if(inputNumber%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("la so nguyen to");
            }else{
                System.out.println("khong la so nguyen to");
            }
        }

    }
}
