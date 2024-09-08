public class MainClass {

    // Main method
    
    public static void main(String[] args) {

        // Creating objects of car and bike

        Vehicle car = new Car("TESLA", "MODEL S", 2022, 4);

        Vehicle bike = new Bike("KTM", "MT-07", 2021, true);

        // Demonstrating the polymorphism

        System.out.println("DEMONSTRATING CAR :");
        car.showDetails();
        car.start();
        car.fuelType();
        car.vehicleSound();
        System.out.println();

        System.out.println("DEMONSTRATING BIKE :");
        bike.showDetails();
        bike.start();
        bike.fuelType();
        bike.vehicleSound();
        System.out.println();

    }
}
