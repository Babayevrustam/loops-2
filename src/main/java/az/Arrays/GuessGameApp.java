package az.Arrays;

import java.util.Random;
import java.util.Scanner;

public class GuessGameApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(101);
        String name;
        System.out.println("Let the game begin!");
        while (true) {
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.print("Enter your guess (0-100): ");
            int guess = input.nextInt();
            if (guess < number) {
                System.out.println("Your number is too small. Please, try again.");
         } else if (guess > number) {
            System.out.println("Your number is too big. Please, try again.");
        } else {
            System.out.printf("Congratulations, %s!%n", name);
            break;
        }
    }
}
}
