import java.util.Scanner;

public class Th6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra:");
        int number = scanner.nextInt();
        check(number);
    }
    public static void check(int a) {
        if (((a % 3) == 0) && ((a % 5)==0)){
            System.out.println("Số " + a + " chia hết cho cả 3 và 5");
        }else if((a % 3) == 0){
            System.out.println("Số " + a + " chia hết cho 3 nhưng không chia hết cho 5");
        }else if((a % 5) == 0){
            System.out.println("Số " + a + " chia hết cho 5 nhưng không chia hết cho 3");
        }else {
            System.out.println("Số " + a + " không chia hết cho cả 3 và 5");
        }
    }
}
