public class Car extends Vehicle {
    private int pojemnośćPasażerska;

    public Car(String brand, double maxSpeed, int year, String model, int pojemnośćPasażerska) {
        super(brand, maxSpeed, year, model);
        this.pojemnośćPasażerska = pojemnośćPasażerska;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pojemość pasażerska: "+pojemnośćPasażerska+ "osób");
    }

}