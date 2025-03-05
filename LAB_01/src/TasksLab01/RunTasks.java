package TasksLab01;

import java.util.Scanner;

public class RunTasks {
    Scanner input = new Scanner(System.in);
    TasksLab01.Tasks tasks = new TasksLab01.Tasks();

    public void run() {
        while (true) {
            System.out.println("Laboratorium 1\n");
            System.out.println("1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("7. Zadanie 7");
            System.out.println("8. Wyjście");
            System.out.print("Wybierz, które zadanie rozwiązać: ");

            int wybor = inputInt();
            switch (wybor) {
                case 1 -> tasks.task001();
                case 2 -> tasks.task002();
                case 3 -> tasks.task003();
                case 4 -> tasks.task004();
                case 5 -> tasks.task005();
                case 6 -> tasks.task006();
                case 7 -> tasks.task007();
                case 8 -> {
                    System.out.println("Zamykanie programu...");
                    return;
                }
                default -> System.out.println("Niepoprawny wybór, spróbuj ponownie.");
            }
        }
    }

    private int inputInt() {
        while (!input.hasNextInt()) {
            System.out.println("Niepoprawna wartość. Wprowadź liczbę całkowitą:");
            input.next();
        }
        return input.nextInt();
    }
}
