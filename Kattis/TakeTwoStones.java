package Kattis;

import java.util.Scanner;

/**
 * Author: ARASH
 * Data: 2/19/2022
 * Time: 1:59 PM
 */

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
