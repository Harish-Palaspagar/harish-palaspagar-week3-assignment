class Triangle extends Shape {

    // Field for base and height

    double base, height;

    // Constructor

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the calculateArea method

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

}
