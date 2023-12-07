package Practice;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tháng của bạn");
        month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("tháng 2 có 28 ngày hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng có 31 ngày");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng có 30 ngày");
        }
    }
}
