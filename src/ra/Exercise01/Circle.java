package ra.Exercise01;

public class Circle {
    private int radius;
    private String color;

    public Circle() {

    }
    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double area() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +
                ", diện tích='" + area() +'\'' +
                '}';
    }
}
