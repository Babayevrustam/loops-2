package az.eolymp2;

import java.util.Scanner;

public class DivisibleApp {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x > 0 && x % 6 == 0) {
                    sum += x;
                    count++;
                }
            }
            System.out.printf("%d %d", count, sum);
        }
    }
}
