import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 10;
        int max = (int) (Math.random() * 1000);
        int numGuesses = 0;

        System.out.println("Загадайте число от " + min + " до " + max);
        System.out.println("Выберите действие: 1. Загадал, 2. Выход");

        int option = in.nextInt();
        if (option == 1) {
            int guess = (min + max) / 2;

            while (true) {
                System.out.println("Вы загадали " + guess + "?");
                System.out.println("Выберите действие: 1. Больше, 2. Меньше, 3. Угадал, 4. Выход");

                int answer = in.nextInt();
                numGuesses++;

                if (answer == 3) {
                    System.out.println("Программа угадала число за " + numGuesses + " попыток.");
                    break;
                } else if (answer == 4) {
                    break;
                } else if (answer == 1) {
                    min = guess + 1;
                    guess = (min + max) / 2;
                } else if (answer == 2) {
                    max = guess - 1;
                    guess = (min + max) / 2;
                }
            }
        }
        System.out.println("Программа завершена.");
    }
}
