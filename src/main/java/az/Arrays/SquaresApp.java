package az.Arrays;

import java.util.Scanner;

public class SquaresApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();

        int num2 = input.nextInt();

        int sumOfSquares = (num1 * num1) + (num2 * num2);

        System.out.println(sumOfSquares);
    }
}