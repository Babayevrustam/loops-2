package az.Arrays;

import java.util.Scanner;

public class UseofFonctionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double max1 = Math.max(x, y);
        double max2 = Math.max(y, z);
        double sum = x + y + z;
        double result = Math.min(Math.min(max1, max2), sum);
        System.out.printf("%.2f", result);
    }
}
