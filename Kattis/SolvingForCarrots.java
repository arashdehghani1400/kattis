package Kattis;

import java.util.Scanner;

/**
 * Author: ARASH
 * Data: 2/12/2022
 * Time: 11:36 PM
 */

public class SolvingForCarrots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int a = 0;
        String[] c = x.split(" ");
        a = Integer.parseInt(c[1]);
        System.out.println(a);
    }
}
