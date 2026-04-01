public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Red", 5),
                new Circle("Blue", 3),
                new Rectangle("Green", 4, 6),
                new Rectangle("Yellow", 2, 8),
                new Triangle("Purple", 3, 4, 5),
                new Triangle("Orange", 5, 5, 5)
        };

        double totalArea = 0;
        for (Shape s : shapes) {
            s.displayInfo();
            totalArea += s.getArea();
        }

        Shape largest = findLargest(shapes);
        System.out.println("\nLargest Shape: " + largest.getClass().getSimpleName() +
                " with Area: " + String.format("%.2f", largest.getArea()));
        System.out.printf("Total Combined Area: %.2f%n", totalArea);
    }

    public static Shape findLargest(Shape[] shapes) {
        if (shapes.length == 0) return null;
        Shape largest = shapes[0];
        for (Shape s : shapes) {
            if (s.getArea() > largest.getArea()) {
                largest = s;
            }
        }
        return largest;
    }
}