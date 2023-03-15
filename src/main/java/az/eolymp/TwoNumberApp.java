package az.eolymp;

import java.util.Scanner;

public class TwoNumberApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n >= 10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
