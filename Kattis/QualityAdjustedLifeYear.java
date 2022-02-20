package Kattis;

import java.util.Scanner;

/**
 * Author: ARASH
 * Data: 2/19/2022
 * Time: 3:07 PM
 */

//not complete
public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String s1;
        String[] s11;
        double number1;
        double number2;
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            s1 = scanner.nextLine();
            s11 = s1.split(" ");
            number1 = Double.parseDouble(s11[0]);
            number2 = Double.parseDouble(s11[1]);
            sum += number1*number2;
        }
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        String s3 = scanner.nextLine();
//        String s4 = scanner.nextLine();
//        String s5 = scanner.nextLine();
//        String s6 = scanner.nextLine();
//
//        String[] s22 = s2.split(" ");
//        String[] s33 = s3.split(" ");
//        String[] s44 = s4.split(" ");
//        String[] s55 = s5.split(" ");
//        String[] s66 = s6.split(" ");
//        double number1 = Double.parseDouble(s66[0]);
//        double number2 = Double.parseDouble(s66[1]);
//        double number3 = Double.parseDouble(s22[0]);
//        double number4 = Double.parseDouble(s22[1]);
//        double number5 = Double.parseDouble(s33[0]);
//        double number6 = Double.parseDouble(s33[1]);
//        double number7 = Double.parseDouble(s44[0]);
//        double number8 = Double.parseDouble(s44[1]);
//        double number9 = Double.parseDouble(s55[0]);
//        double number10 = Double.parseDouble(s55[1]);
//
//        sum += (number1 * number2);
//        sum += (number3 * number4);
//        sum += (number5 * number6);
//        sum += (number7 * number8);
//        sum += (number9 * number10);
        System.out.printf("%.3f",sum);
    }
}
