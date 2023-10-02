import java.util.Scanner;

public class Th4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhap chieu dai");
            double a = scanner.nextDouble();
            System.out.println("Nhap chieu rong");
            double b = scanner.nextDouble();
            chuViVaDienTich(a,b);
        }
    }

    public static void chuViVaDienTich(double a,double b) {
        if (a >= 0 && b>=0) {
            System.out.println("chu vi la: "+ (a+b)*2);
            System.out.println("dien tich la: "+ (a*b));
        }
    }
}
