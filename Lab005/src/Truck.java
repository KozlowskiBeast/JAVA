public class Truck extends Vehicle{
    private  double loadCapacity;

    public Truck(String brand, double maxSpeed, int year, String model, double loadCapacity) {
        super(brand, maxSpeed, year, model);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Max ładowność: "+loadCapacity+" ton");
    }
}