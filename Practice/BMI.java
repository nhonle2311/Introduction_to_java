package Practice;

import java.util.Map;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Weight of you:");
        weight = scanner.nextDouble();
        System.out.println("input Height of you:");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        if (bmi < 18){
            System.out.println( bmi + "underweight");
        }else if (bmi < 25){
            System.out.println(bmi + "normal");
        }else if (bmi < 30){
            System.out.println(bmi + "overweight");
        }else {
            System.out.println("obese");
        }
    }
}
