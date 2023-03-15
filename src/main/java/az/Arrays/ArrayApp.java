package az.Arrays;

import java.util.Scanner;

import static java.lang.System.in;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                System.out.print(nums[i] + " ");
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}