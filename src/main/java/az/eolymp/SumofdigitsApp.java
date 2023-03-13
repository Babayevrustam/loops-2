package az.eolymp;

import java.util.Scanner;

public class SumofdigitsApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int last = num % 10;            // 7
        int first = (num / 1000) % 10;  // 1

        int sumOfDigits = first + last;
        System.out.println(sumOfDigits);
    }
}
