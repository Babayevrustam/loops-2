package Lesson3;

public class WhileApp {
    public static void main(String[] args) {
        char letter = 'a';
        while (letter <= 'z') {
        System.out.print(letter);
        letter++;
    }
        for (char letter2 = 'z'; letter2 >= 'a'
                ; letter2--) {
            System.out.print(letter2);
        }
    }
}
