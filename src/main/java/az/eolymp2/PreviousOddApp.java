package az.eolymp2;

import java.util.Scanner;

public class PreviousOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n - (n % 2 == 0 ? 1 : 2));
    }
}
