package az.eolymp2;

import java.util.Scanner;

public class SumOddApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int sum = 0;
            for (int j = 1; j <= n ; j += 2) {
                sum += j;
            }
            System.out.println(sum);
                
            }
            
        }
    }
