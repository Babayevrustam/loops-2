package az.eolymp2;

import java.util.Scanner;

public class SquareAppp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        int Digit1 = n / 10;
        int Digit2 = n % 10;

        sum = Digit1 + Digit2;
        int SquareOFsum = sum * sum;
        System.out.println(SquareOFsum);
    }
}
