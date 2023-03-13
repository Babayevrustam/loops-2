package az.eolymp;

import java.util.Scanner;

public class SeasonApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num <= 0 || num > 12) {
            System.out.println("Invalid input!");
        } else if (num >= 3 && num <= 5) {
            System.out.println("Spring");
        } else if (num >= 6 && num <= 8) {
            System.out.println("Summer");
        } else if (num >= 9 && num <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }
    }

}