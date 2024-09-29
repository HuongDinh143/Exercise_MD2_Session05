package ra.Exercise01;

public class Cylinder extends Circle {
    private int height;
    public Cylinder(){

    }
    public Cylinder(int radius, String color, int height){
        super(radius, color);
        this.height = height;
    }
    public double vol(){
        return this.height*area();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "Bán kính=" + getRadius() +
                ", Chiều cao=" + this.height +
                ", Màu sắc='" + getColor() +
                ", Thể tích='" + vol() +'\'' +
                '}';
    }
}
