package Kattis;

import java.util.Scanner;

/**
 * Author: ARASH
 * Data: 2/19/2022
 * Time: 2:07 PM
 */

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.println((i + 1) + " Abracadabra");
        }
    }
}
