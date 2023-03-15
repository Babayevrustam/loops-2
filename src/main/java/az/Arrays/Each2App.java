package az.Arrays;

import java.util.Scanner;

public class Each2App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0 || n % 2 == 0 || n < 0 || n % 2 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}