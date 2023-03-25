package az.eolymp2;

import java.util.Scanner;

public class Sum2App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            double sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                double x = scanner.nextDouble();
                if (x > 0) {
                    sum += x;
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Not Found");
            } else {
                System.out.printf("%.2f", sum / count);
            }
        }
    }