import java.util.Scanner;

public class Th5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập diem toan");
        double match = scanner.nextDouble();
        System.out.println("Nhập diem vật lí");
        double physics = scanner.nextDouble();
        System.out.println("Nhập diem vật hóa");
        double chemical = scanner.nextDouble();
        System.out.println("Nhập diem vật văn");
        double literature = scanner.nextDouble();
        System.out.println("Nhập diem vật anh");
        double english = scanner.nextDouble();
        double averageScore = (match+physics+chemical+literature+english)/5;
        classification(averageScore);
    }

    public static void classification(double num) {
        if (num <=10 && num >= 0){
            if (num < 5){
                System.out.println("Yếu");
            }
            else if(num < 6.5){
                System.out.println("Trung bình");
            }
            else if(num < 8 ){
                System.out.println("Khá");
            }
            else if(num < 9){
                System.out.println("giỏi");
            }
            else{
                System.out.println("Xuất sắc");
            }
        }else{
            System.out.println("Nhập điểm linh tinh");
        }
    }
}
