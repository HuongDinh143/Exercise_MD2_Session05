package ra.Exercise01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn");
        int radius = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào chiều cao hình trụ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào màu sắc hình trụ:");
        String color = scanner.nextLine();
        Cylinder cyl = new Cylinder(radius,color, height);
        System.out.println("Thể tích hình trụ: "+cyl.vol());
        System.out.println(cyl);


    }
}
