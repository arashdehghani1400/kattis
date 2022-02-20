package Kattis;

import java.util.Scanner;

/**
 * Author: ARASH
 * Data: 2/19/2022
 * Time: 11:34 PM
 */

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
//        System.out.println(number1+ number2);
        if (x>0 & y>0){
            System.out.println("1");
        }else if (x<0 & y>0){
            System.out.println("2");
        }else if (x<0 & y<0){
            System.out.println("3");
        }else {
            System.out.println("4");
        }
    }
}
