package az.eolymp2;

import java.util.Scanner;

public class RestangleApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }