package Lesson3;

import java.util.Scanner;

public class DoWhileApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num > 0) {
            System.out.println(num);
            System.out.println(num % 10);
            num /= 10;
        }
    }
}
