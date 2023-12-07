package Practice;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("input year:");
        year = scanner.nextInt();
        if (year % 4 == 0 ){
            if (year % 100 == 0) {
                if (year % 400 == 0){
                    System.out.println("is leap year");
                }else {
                    System.out.println("not leap year");
                }

            }else {
                System.out.println("not leap year");
            }
        } else {
            System.out.println("not leap year");
        }
    }
}

