package az.Arrays;

public class TwoarraysApp {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        int counter = 1;
        for (int row = 0; row < nums.length; row++) {
            int[] currRow = nums[0];
            for (int col = 0; col < currRow.length; col++) {
                nums[row][col] = counter++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
