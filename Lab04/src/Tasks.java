import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Student[] tablicaStudentow = new Student[100];
        wypelnijTablice(tablicaStudentow);
        wprowadzDanePodIndeks(tablicaStudentow, 1);
        wprowadzDanePodIndeks(tablicaStudentow, 3);
        edytujDanePodIndeksem(tablicaStudentow, 2);
        pokazStudentaPodIndeksem(tablicaStudentow,2);
        usunStudenta(tablicaStudentow,2);
        pokazStudentowZakresu(tablicaStudentow,0, 5);

    }

    public static void wypelnijTablice(Student[] tablica){
        for(int i = 0; i < 100; i++){
            tablica[i] = new Student("", "", "", i, 0);
        }
    }

    public static void wprowadzDanePodIndeks(Student[] tablica, int indeks){
        Scanner input = new Scanner(System.in);
        for (Student student : tablica) {
            if (student.getNr_indeksu() == indeks) {
                if(student.getImie().isEmpty()){
                    System.out.println("Podaj imię");
                    student.setImie(input.nextLine());
                }
                if(student.getNazwisko().isEmpty()){
                    System.out.println("Podaj nazwisko");
                    student.setNazwisko(input.nextLine());
                }
                if(student.getNazwaSpecjalnosci().isEmpty()){
                    System.out.println("Podaj specjalizację");
                    student.setNazwaSpecjalnosci(input.nextLine());
                }
                if(student.getRokStudiow() == 0) {
                    System.out.println("Podaj rok studiów.");
                    student.setRokStudiow(input.nextInt());
                }
            }
        }
    }

    public static void edytujDanePodIndeksem(Student[] tablica, int indeks){
        Scanner input = new Scanner(System.in);
        for (Student student : tablica) {
            if (student.getNr_indeksu() == indeks) {
                System.out.println("Podaj imię");
                student.setImie(input.nextLine());
                System.out.println("Podaj nazwisko");
                student.setNazwisko(input.nextLine());
                System.out.println("Podaj specjalizację");
                student.setNazwaSpecjalnosci(input.nextLine());
                System.out.println("Podaj rok studiów.");
                student.setRokStudiow(input.nextInt());
            }
        }
    }
    public static void usunStudenta(Student[] tablica, int indeks){
        for (Student student : tablica) {
            if (student.getNr_indeksu() == indeks) {
                student.setImie("");
                student.setNazwisko("");
                student.setNazwaSpecjalnosci("");
                student.setRokStudiow(0);
                student.setNr_indeksu(0);
            }
        }
    }
    public static void pokazStudentaPodIndeksem(Student[] tablica, int indeks){
        for (Student student : tablica) if (student.getNr_indeksu() == indeks) student.pokazDane();
    }
    public static void pokazStudentowZakresu(Student[] tablica, int poczatek, int koniec){
        if (poczatek > koniec){
            int temp = poczatek;
            poczatek = koniec;
            koniec = temp;
        }
        for(int i = poczatek; i <= koniec; i++) tablica[i].pokazDane();
    }
}