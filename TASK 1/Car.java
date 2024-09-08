class Car extends Vehicle {

    // Field declaration

    int numberOfDoors;

    // Constructor

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Overriding the start method

    @Override
    void start() {
        System.out.println("CAR STARTING");
    }

    // Overriding the fuelType method

    @Override
    void fuelType() {
        System.out.println("CAR FUEL TYPE : PETROL");
    }

    // Overriding the vehicleSound method

    @Override
    void vehicleSound() {
        System.out.println("CAR SOUND : SOME CAR SOUND");
    }

    // Method to show each car details

    void showCarDetails() {
        showDetails();
        System.out.println("NUMBER OF DOORS : " + numberOfDoors);
    }

}
