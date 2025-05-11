public class Main {
    public static void main(String[] args) {
        Punkt p1=new Punkt(10,15);
        Punkt p2=new Punkt(11,20);
        Punkt p3=new Punkt(3,2);


        System.out.println("Wypisanie punktu1:\n");
        p1.opis();
        System.out.println("Wypisanie i zerowanie punktu2:\n");
        p2.opis();
        p2.zeruj();
        p2.opis();
        System.out.println("Przesunięcie punktu 3");
        p3.opis();
        p3.przesun(21,50);
        p3.opis();
        Trojkat t1=new Trojkat(10,15);
        Figura f1=new Figura("Czerwony");
        Prostokat prostokat1=new Prostokat(15,10);
        Okrag o1=new Okrag(p1,10);
        System.out.println("Sprawdzenie metod\n");
        System.out.println(f1.opis());
        System.out.println(prostokat1.getPowierzchnia());
        System.out.println("Wywołanie przesunięcia prostokąta: \n");
        prostokat1.przesun(10,15);

        Kwadrat k1=new Kwadrat(10,10);
        System.out.println(t1.opis());
        System.out.println(prostokat1.opis());
        System.out.println(k1.opis());
        System.out.println(o1.opis());

    }
}