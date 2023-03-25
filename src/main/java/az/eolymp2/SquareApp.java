package az.eolymp2;

import java.util.Scanner;

public class SquareApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double n = scanner.nextDouble();
            double sqrt = Math.sqrt(n);
            System.out.printf("%.6f", sqrt);
        }
    }
