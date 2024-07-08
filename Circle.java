public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * this.radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);

        System.out.printf("My circle has a radius %d\n", circle.getRadius());
    
        circle.setRadius(4);
        System.out.printf("After updating the circle, it has a radius %d\n", circle.getRadius());
        System.out.printf("The circle has area %f and circumference %f\n", circle.getArea(), circle.getCircumference());

    }
}
