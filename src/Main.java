import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        boolean t = false;
//        System.out.println(lontrube(3,0));
//    }
//
//    public static int lontrube(int a,int b){
//        int sum = 0;
//    if (a>b){
//        sum = a-b;
//        System.out.println("vao 1");
//    }
//    else if (b>a){
//        sum = b-a;
//        System.out.println("vao 2");
//    }else{
//        sum = b+a;
//        System.out.println("vao 3");
//    }
//    return sum;
//    }
public static void main(String[] args) {
    int rate = 24330;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhập số tiền (usd) bạn muốn đổi:");
    double usd = scanner.nextDouble();
    double vnd = usd * rate;
    DecimalFormat formatter = new DecimalFormat("###,###,###");

    System.out.println(usd + "usd bằng với: " + formatter.format(vnd) + "vnd");
}
}
