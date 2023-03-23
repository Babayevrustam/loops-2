package az.eolymp2;

import java.util.Scanner;

public class MatrixAoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = input.nextInt();

        System.out.print("Enter number of columns: ");
        int m = input.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = i * m + j + 1;
            }
        }
        System.out.println("Matrix:");


        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.out.print(matrix[i][j] + " ");
        }

        System.out.println();
    }
}
}