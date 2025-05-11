public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double maxSpeed;

    public Vehicle(String brand, double maxSpeed, int year, String model) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.model = model;
    }

    public void displayInfo(){
        System.out.println("Marka: "+brand+"\n Model: "+model+"\n Rok produkcji: "+year+
                "\n Max prędkość: "+maxSpeed+"km/h");
    }
}