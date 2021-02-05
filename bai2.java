import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so tien gui:");
        double amount=scanner.nextDouble();
        System.out.println("nhap vap lai suat:");
        float rate= scanner.nextFloat();
        System.out.println("nhap vao so thang gui:");
        int month=scanner.nextInt();
        double yield=amount*rate*month/12;
        System.out.printf("so tien lai nhan duoc %.2f",yield);
    }
}
