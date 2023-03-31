package az.eolymp2;

import java.util.Scanner;

public class Squere22App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double max = 0;

        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            double abs = Math.abs(num);
            if (abs > max) {
                max = abs;
            }
        }

        System.out.printf("%.2f", max);
    }
}