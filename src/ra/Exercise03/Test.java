package ra.Exercise03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle;
        do {
            System.out.println("Nhập vào cạnh số 1: ");
            Double side1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào cạnh số 2: ");
            Double side2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào cạnh số 3: ");
            Double side3 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập vào màu sắc của hình tam giác");
            String color = scanner.nextLine();

            if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
                System.err.println("chiều dài 3 cạnh không thỏa mãn hình tam giác");
            } else {
                triangle = new Triangle(color, side1, side2, side3);
                break;
            }
        } while (true);

        triangle.getPerimeter();
        triangle.getArea();
        System.out.println(triangle);


    }
}
