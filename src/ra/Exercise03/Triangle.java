package ra.Exercise03;

public class Triangle extends Shape {
    private double side1 ;
    private double side2 ;
    private double side3 ;
    public Triangle() {
        this("pink",1.0, 1.0, 1.0);
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return this.side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double  getPerimeter(){
        return (this.side1 + this.side2 + this.side3);
    }
    public double getArea() {
        double p = getPerimeter() / 2;
        double S = Math.sqrt(p*(p - this.side1) * (p - this.side2) * (p - this.side3));
        return S;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + this.side1 +
                ", side2=" + this.side2 +
                ", side3=" + this.side3 +
                ", Chu vi=" + getPerimeter() +
                ", Dien tích=" + getArea() +
                ", Màu sắc=" + getColor() +
                '}';
    }
}
