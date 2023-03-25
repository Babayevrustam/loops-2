package az.eolymp2;

import java.util.Scanner;

public class GreaterApp {
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextDouble();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] <= 2.5) {
                    System.out.printf("%d %.2f", i + 1, arr[i]);
                    return;
                }
            }
            System.out.println("Not Found");
        }
    }
}
