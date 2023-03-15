package az.eolymp;

import java.util.Scanner;

public class EvenApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
