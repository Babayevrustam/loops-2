package az.eolymp2;

import java.util.Scanner;

public class DegreeAPp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n & (n - 1)) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
