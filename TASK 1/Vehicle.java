abstract class Vehicle {

    // Field declaration

    String make;
    String model;
    int year;

    // Constructor

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Abstract method

    abstract void start();

    // Method to show vehicle details

    void showDetails() {
        System.out.println("VEHICLE DETAILS : " + year + " " + make + " " + model);
    }

    // Method to print fuel type

    void fuelType() {
        System.out.println("DEFAULT FUEL TYPE : GASOLINE");
    }

    // Method to print vehicle sound

    void vehicleSound() {
        System.out.println("VEHICLE SOUND : DEFAULT VEHICLE SOUND");
    }

}
