package az.eolymp;

import java.util.Scanner;

public class PerimetrApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(2*(a+b));
    }
}
