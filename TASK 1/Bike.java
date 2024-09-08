class Bike extends Vehicle {

    // Field declaration

    boolean hasCarrier;

    // Constructor

    Bike(String make, String model, int year, boolean hasCarrier) {
        super(make, model, year);
        this.hasCarrier = hasCarrier;
    }

    // Overriding the start method

    @Override
    void start() {
        System.out.println("BIKE STARTING");
    }

    // Overriding the fuelType method

    @Override
    void fuelType() {
        System.out.println("BIKE FUEL TYPE : DIESEL");
    }

    // Overriding the vehicleSound method

    @Override
    void vehicleSound() {
        System.out.println("BIKE SOUND : SOME BIKE SOUND");
    }

    // Method to show each bike details

    void showBikeDetails() {
        showDetails();
        System.out.println("HAS CARRIER : " + (hasCarrier ? "YES" : "NO"));
    }

}
