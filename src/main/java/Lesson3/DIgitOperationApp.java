package Lesson3;

import java.util.Scanner;

public class DIgitOperationApp {
    public static void main(String[] args) {
        // 1. input
        int num = new Scanner(System.in).nextInt();
        // 2. process
        int sum = 0;
        int prod = 1;
        int count = 0;
        while (num > 0) {
            int remainder = num % 10;
            count++;
            sum += remainder;
            prod *= remainder;
            num /= 10;
        }
        // 3. output
        System.out.printf("Sum of digits is: %d\n", sum);
        System.out.printf("Prod of digits is: %d\n", prod);
        System.out.printf("Count of digits is: %d\n", count);
    }
}
