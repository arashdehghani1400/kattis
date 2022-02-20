package Kattis;

import java.util.Scanner;

/**
 * Author: ARASH
 * Data: 2/12/2022
 * Time: 10:27 PM
 */

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int a = 0;
        String[] c = x.split(" ");
        for (int i = 0; i < c.length; i++) {
            if (c[i] != " ") {
                a += Integer.parseInt(c[i]);
            }
        }
        System.out.println(a);
    }
}
