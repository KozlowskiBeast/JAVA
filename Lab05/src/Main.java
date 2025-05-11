public class Main {
    public static void main(String[] args) {
        Adres adres=new Adres("Rzeszow","Rejtana","15c","35-456");
        Student student=new Student("Jan Nowakowski",23,adres,"jn12345",2,"IiE");
        System.out.println(student.toString());
    }
}