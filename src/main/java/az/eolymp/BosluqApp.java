package az.eolymp;

import java.util.Scanner;

public class BosluqApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int FirstDigit = n / 10;
        int Second = n%10;
        System.out.println(FirstDigit+ " " + Second);

    }
}
