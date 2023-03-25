package az.eolymp2;

import java.util.Scanner;

public class NegativeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 0) {
                arr[i] = x + 2;
            } else {
                arr[i] = x;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
