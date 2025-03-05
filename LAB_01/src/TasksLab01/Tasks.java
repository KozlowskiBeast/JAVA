package TasksLab01;

import java.util.Random;
import java.util.Scanner;

public class Tasks {
    Scanner input = new Scanner(System.in);
    TasksLab01.Variables variables = new TasksLab01.Variables();

    public void task001() {
        System.out.println("Imię: " + variables.name + ", Wiek: " + variables.age);
    }

    public void task002() {
        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = input.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int num2 = input.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Różnica: " + (num1 - num2));
        System.out.println("Iloczyn: " + (num1 * num2));
    }

    public void task003() {
        System.out.print("Podaj liczbę: ");
        int num = input.nextInt();
        System.out.println("Czy liczba jest parzysta? " + (num % 2 == 0));
    }

    public void task004() {
        System.out.print("Podaj liczbę: ");
        int num = input.nextInt();
        System.out.println("Czy liczba jest podzielna przez 3 i 5? " + (num % 3 == 0 && num % 5 == 0));
    }

    public void task005() {
        System.out.print("Podaj liczbę: ");
        int num = input.nextInt();
        System.out.println("Liczba podniesiona do 3 potęgi: " + Math.pow(num, 3));
    }

    public void task006() {
        System.out.print("Podaj liczbę: ");
        double num = input.nextDouble();
        System.out.println("Pierwiastek kwadratowy: " + Math.sqrt(num));
    }

    public void task007() {
        System.out.print("Podaj dolną granicę przedziału (a): ");
        int a = input.nextInt();
        System.out.print("Podaj górną granicę przedziału (b): ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("Dolna granica nie może być większa niż górna.");
            return;
        }

        Random random = new Random();
        int x = random.nextInt(b - a + 1) + a;
        int y = random.nextInt(b - a + 1) + a;
        int z = random.nextInt(b - a + 1) + a;

        System.out.println("Wylosowane liczby: " + x + ", " + y + ", " + z);
        System.out.println("Czy można utworzyć trójkąt prostokątny? " + checkRightTriangle(x, y, z));
    }

    private boolean checkRightTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }
}
