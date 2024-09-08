public class MainClass {

    // Main method
    
    public static void main(String[] args) {

        // Creating objects of Circle, Rectangle, and Triangle

        Shape circle = new Circle(9.0);

        Shape rectangle = new Rectangle(11.0, 12.0);

        Shape triangle = new Triangle(44.0, 88.0);

        // Calculating the area of the shapes

        System.out.println("CIRCLE :");
        circle.displayArea();

        System.out.println("RECTANGLE :");
        rectangle.displayArea();

        System.out.println("TRIANGLE :");
        triangle.displayArea();

    }
}
