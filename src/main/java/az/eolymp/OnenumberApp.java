package az.eolymp;

import java.util.Scanner;

public class OnenumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n >= 0 && n < 10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
