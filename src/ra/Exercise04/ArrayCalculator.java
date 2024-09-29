package ra.Exercise04;

public class ArrayCalculator {
    public static int sumOfArray(int [] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += i;
        }
        return sum;
    }
    public static double sumOfArray(double [] arr){
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int sum1 = sumOfArray(arr1);
        System.out.println("Tổng của các số nguyên: " + sum1);
        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        double sum2 = sumOfArray(arr2);
        System.out.println("Tổng của các số thực là: " + sum2);


    }
}
