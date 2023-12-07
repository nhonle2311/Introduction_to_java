package Practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a, b, x;
        System.out.println("phường trình bậc nhất có dạng ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a:");
        a = scanner.nextFloat();
        System.out.println("nhập b:");
        b = scanner.nextFloat();
        if (a != 0 ){
            x = -b / a;
            System.out.println("phường trình có nghiệm là x= " + x);
        }else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
