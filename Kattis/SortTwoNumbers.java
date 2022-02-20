package Kattis;

import java.util.Scanner;

/**
 * Author: ARASH
 * Data: 2/19/2022
 * Time: 2:23 PM
 */

public class SortTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int number1 = Integer.parseInt(inputs[0]);
        int number2 = Integer.parseInt(inputs[1]);
        if (number1 > number2) {
            System.out.println(number2 + " " + number1);
        } else {
            System.out.println(number1 + " " + number2);
        }
    }
}
