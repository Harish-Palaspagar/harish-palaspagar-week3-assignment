class Rectangle extends Shape {

    // Field for length and width

    double length;
    double width;

    // Constructor

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the calculateArea method

    @Override
    double calculateArea() {
        return length * width;
    }

}
