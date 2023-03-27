package az.eolymp2;

import java.util.Scanner;

public class FirstLastApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sumofDigit = n / 100;
        int sumDigit = n % 10;
         if (sumofDigit > sumDigit) {
             System.out.println(sumofDigit);
         } else if (sumDigit > sumofDigit) {
             System.out.println(sumDigit);
         } else {
             System.out.println("=");

         }
    }
    }