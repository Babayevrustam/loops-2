package az.eolymp;

import java.util.Scanner;

public class PerviousApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + "-2");
            }
        }
    }
}
