package Exercise;

import java.util.Scanner;

public class VND_to_USD {
    public static void main(String[] args) {
        double vnd, usd;
        Scanner scanner = new Scanner(System.in);
        usd = scanner.nextDouble();
        System.out.println("input USD:");
        vnd = usd * 23000;
        System.out.println("VND = " + vnd);
    }
}
