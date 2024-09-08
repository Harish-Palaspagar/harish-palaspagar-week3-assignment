abstract class Shape {

    // Abstract method to calculate the area

    abstract double calculateArea();

    // Method to display the area

    void displayArea() {
        System.out.println("AREA : " + calculateArea());
    }

}
