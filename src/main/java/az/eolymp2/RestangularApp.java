package az.eolymp2;

import java.util.Scanner;

public class RestangularApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
