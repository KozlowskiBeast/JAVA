public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 180.0, 2020, "Corolla", 5);
        System.out.println("Informacje o samochodzie:");
        car.displayInfo();
        System.out.println();

        Truck truck = new Truck("Volvo", 140.0, 2018, "FH16", 25.0);
        System.out.println("Informacje o ciężarówce:");
        truck.displayInfo();
        System.out.println();

        Engine engine = new Engine(420, "Diesel");
        System.out.println("Informacje o silniku:");
        engine.displayInfo();
        engine.startEngine();
    }
}
