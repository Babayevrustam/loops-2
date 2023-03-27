package az.eolymp2;

import java.util.Scanner;

public class MaxMinApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long min = Math.min(a, b);
        long max = Math.max(a, b);

        System.out.println(min + " " + max);
    }
}
