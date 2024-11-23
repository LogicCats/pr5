package geometry;


public class GeometryCalculator {

    // 1. Площадь круга
    public static double calculateCircleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be non-negative");
        return Math.PI * radius * radius;
    }

    // 2. Периметр круга
    public static double calculateCirclePerimeter(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius must be non-negative");
        return 2 * Math.PI * radius;
    }

    // 3. Площадь прямоугольника
    public static double calculateRectangleArea(double length, double width) {
        if (length < 0 || width < 0) throw new IllegalArgumentException("Dimensions must be non-negative");
        return length * width;
    }

    // 4. Периметр прямоугольника
    public static double calculateRectanglePerimeter(double length, double width) {
        if (length < 0 || width < 0) throw new IllegalArgumentException("Dimensions must be non-negative");
        return 2 * (length + width);
    }

    // 5. Площадь квадрата
    public static double calculateSquareArea(double side) {
        if (side < 0) throw new IllegalArgumentException("Side must be non-negative");
        return side * side;
    }

    // 6. Периметр квадрата
    public static double calculateSquarePerimeter(double side) {
        if (side < 0) throw new IllegalArgumentException("Side must be non-negative");
        return 4 * side;
    }

    // 7. Площадь треугольника по формуле Герона
    public static double calculateTriangleArea(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) throw new IllegalArgumentException("Sides must be non-negative");
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // 8. Периметр треугольника
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) throw new IllegalArgumentException("Sides must be non-negative");
        return a + b + c;
    }
}
