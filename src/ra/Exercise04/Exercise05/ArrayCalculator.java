package ra.Exercise04.Exercise05;

public class ArrayCalculator {
    public static int maxOfArray(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static double maxOfArray(double[] array){
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static int minOfArray(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
    public static double minOfArray(double[] array){
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array1 = {1,8,6,9,10};
        int max1 = maxOfArray(array1);
        System.out.println("Số lớn nhất: "+max1);
        double[] array2 = {2.3,3,4,5,6,7,8,9.5};
        double max2 = maxOfArray(array2);
        System.out.println("Số lớn nhất: " + max2);
        int min1 = minOfArray(array1);
        System.out.println("Số nhỏ nhất;: " + min1);
        double min2 = minOfArray(array2);
        System.out.println("Số nhỏ nhất;: " + min2);
    }
}
