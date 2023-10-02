import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhap so de dem: ");
            int number = scanner.nextInt();
            switch (number){
                case 10:
                    System.out.println("so muoi");
                    break;
                case 11:
                    System.out.println("so muoi mot");
                    break;
                case 12:
                    System.out.println("so muoi hai");
                    break;
                case 13:
                    System.out.println("so muoi ba");
                    break;
                case 14:
                    System.out.println("so muoi bon");
                    break;
                case 15:
                    System.out.println("so muoi lam");
                    break;
                case 16:
                    System.out.println("so muoi sau");
                    break;
                case 17:
                    System.out.println("so muoi bay");
                    break;
                case 18:
                    System.out.println("so muoi tam");
                    break;
                case 19:
                    System.out.println("so muoi chin");
                    break;
                case 20:
                    System.out.println("so hai muoi");
                    break;
                default:
                    System.out.println("ngoai pham vi dem");
                    break;
            }
        }
    }
}


