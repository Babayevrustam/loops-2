package az.eolymp2;

import java.util.Scanner;

public class MaxApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long max = Math.max( Math.max(a, b), Math.max(c, d));
        System.out.println(max);
    }
}
