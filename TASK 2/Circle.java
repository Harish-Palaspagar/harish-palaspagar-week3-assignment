class Circle extends Shape {

    // Field for radius

    double radius;

    // Constructor

    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the calculateArea method

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

}
