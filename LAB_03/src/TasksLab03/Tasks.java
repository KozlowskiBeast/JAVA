package TasksLab03;

import java.util.Random;
import java.util.Scanner;

public class Tasks {


    // Task 1: Średnia liczba punktów w grupie
    protected double Task001(int n, Scanner input) {
        if (n <= 0) {
            System.out.println("Liczba studentów musi być większa od zera.");
            return 0.0;
        }

        int sum = 0, count = 0;
        while (count < n) {
            System.out.print("Podaj liczbę punktów dla studenta " + (count + 1) + ": ");
            while (!input.hasNextInt()) { // Sprawdza, czy użytkownik wprowadził liczbę całkowitą
                System.out.println("Błąd! Wprowadź poprawną liczbę całkowitą.");
                input.next(); // Usuwa błędne wejście
            }
            sum += input.nextInt();
            count++;
        }
        return (double) sum / n;
    }


    // Task 2: Liczenie sumy i ilości liczb ujemnych oraz dodatnich
    protected void Task002(Scanner input) {
        int sumNegative = 0, sumPositive = 0, countNegative = 0, countPositive = 0;

        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");

            while (!input.hasNextInt()) { // Obsługa błędnych danych wejściowych
                System.out.println("Błąd! Podaj liczbę całkowitą.");
                input.next(); // Odrzucenie błędnej wartości
            }

            int num = input.nextInt();
            if (num < 0) {
                sumNegative += num;
                countNegative++;
            } else if (num > 0) { // Poprawiona obsługa wartości 0
                sumPositive += num;
                countPositive++;
            }
        }

        System.out.println("Liczba liczb ujemnych: " + countNegative + ", suma liczb ujemnych: " + sumNegative);
        System.out.println("Liczba liczb dodatnich: " + countPositive + ", suma liczb dodatnich: " + sumPositive);
    }

    // Task 3: Suma liczb parzystych w ciągu
    protected int Task003(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Task 4: Generowanie losowych liczb i sumowanie parzystych
    protected int Task004(int n) {
        Random rand = new Random();
        int[] numbers = new int[n];
        System.out.print("Wylosowane liczby: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(56) - 10; // zakres (-10 do 45)
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return Task003(numbers);
    }

    // Task 5: Sprawdzenie palindromu
    protected boolean Task005(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }

}
