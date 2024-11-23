package geometry.tests;


import geometry.GeometryCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GeometryCalculatorTest {

    @Test
    void testCalculateCircleArea() {
        assertEquals(28.27, GeometryCalculator.calculateCircleArea(3), 0.01);
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateCircleArea(-1));
    }

    @Test
    void testCalculateCirclePerimeter() {
        assertEquals(18.85, GeometryCalculator.calculateCirclePerimeter(3), 0.01);
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateCirclePerimeter(-1));
    }

    @Test
    void testCalculateRectangleArea() {
        assertEquals(20, GeometryCalculator.calculateRectangleArea(4, 5));
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateRectangleArea(-1, 5));
    }

    @Test
    void testCalculateRectanglePerimeter() {
        assertEquals(18, GeometryCalculator.calculateRectanglePerimeter(4, 5));
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateRectanglePerimeter(4, -5));
    }

    @Test
    void testCalculateSquareArea() {
        assertEquals(16, GeometryCalculator.calculateSquareArea(4));
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateSquareArea(-4));
    }

    @Test
    void testCalculateSquarePerimeter() {
        assertEquals(16, GeometryCalculator.calculateSquarePerimeter(4));
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateSquarePerimeter(-4));
    }

    @Test
    void testCalculateTriangleArea() {
        assertEquals(6, GeometryCalculator.calculateTriangleArea(3, 4, 5), 0.01);
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateTriangleArea(3, -4, 5));
    }

    @Test
    void testCalculateTrianglePerimeter() {
        assertEquals(12, GeometryCalculator.calculateTrianglePerimeter(3, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> GeometryCalculator.calculateTrianglePerimeter(3, -4, 5));
    }
}
