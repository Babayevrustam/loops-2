package az.eolymp2;

import java.util.Scanner;

public class SumofSquareApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
