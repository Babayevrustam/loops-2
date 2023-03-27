package az.Arrays;

import java.util.Scanner;

public class ProductofDigitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        System.out.println(product);
    }
}
