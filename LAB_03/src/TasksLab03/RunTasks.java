package TasksLab03;

import java.util.Scanner;

public class RunTasks {

    Scanner input = new Scanner(System.in);
    Tasks tasks = new Tasks();

    public void Run(){
        MenuView();
    }

    private void MenuView(){
        System.out.println("Laboratorium 3\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        int wybor = InputInt();
        switch (wybor){

            case 1:

                System.out.print("Podaj liczbę studentów: ");

                int n = InputInt(); // Pobranie liczby studentów z obsługą błędów
                if (n <= 0) {
                    System.out.println("Liczba studentów musi być większa od zera.");
                    break; // Zakończ case, jeśli n jest niepoprawne
                }

                System.out.println("Średnia liczba punktów: " + tasks.Task001(n, new Scanner(System.in)));
                break;

            case 2:
                tasks.Task002(new Scanner(System.in)); // Wywołanie poprawionej metody
                break;

            case 3:
                System.out.print("Podaj ilość liczb: ");
                int count = InputInt();
                int[] numbers = new int[count];
                for (int i = 0; i < count; i++) {
                    System.out.print("Podaj liczbę: ");
                    numbers[i] = InputInt();
                }
                System.out.println("Suma liczb parzystych: " + tasks.Task003(numbers));
                break;
            case 4:
                System.out.print("Podaj ilość losowanych liczb: ");
                int nRand = InputInt();
                System.out.println("Suma liczb parzystych: " + tasks.Task004(nRand));
                break;
            case 5:
                System.out.print("Podaj słowo: ");
                String word = input.next();
                System.out.println("Czy słowo jest palindromem? " + tasks.Task005(word));
                break;
            case 6:
                System.out.println("Koniec programu!");
                return;
            default:
                System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
                break;
        }
    }

    private int InputInt(){
        while (!input.hasNextInt()) {
            System.out.println("Błąd! Podaj liczbę całkowitą.");
            input.next();
        }
        return input.nextInt();
    }

}
