package Practice;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        double width, height, area ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng:" );
        width = scanner.nextDouble();

        System.out.println("nhập nhiều dài:");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("diện tích:" + area);

    }
}
