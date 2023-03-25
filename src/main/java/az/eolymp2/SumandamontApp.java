package az.eolymp2;

import java.util.Scanner;

public class SumandamontApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            sum += x;
            count++;
        }
        System.out.println(count + " " + sum);
    }
}
