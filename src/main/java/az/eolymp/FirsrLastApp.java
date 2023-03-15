package az.eolymp;

import java.util.Scanner;

public class FirsrLastApp {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int prod = 1;
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            prod = prod * remainder;
            System.out.println("Prod is: " + prod);
        }
        System.out.println(prod);
    }

}
