package az.Arrays;

import java.util.Scanner;

public class LastDigitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastDigit = n % 10;
        System.out.println(lastDigit);
    }
}
