

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        Bike bike = new Bike("Ferrari", "CBR1000RR", 2023);

        System.out.println("Car details:");
        car.vehicleDetails();
        car.accelerate();

        System.out.println("\nBike details:");
        bike.vehicleDetails();
        bike.accelerate();
    }
}