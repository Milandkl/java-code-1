import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // create two integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + isEqual);
        
        int[] array3 = new int[5];
        Arrays.fill(array3,10);
        System.out.println("Array3 after filling: " + Arrays.toString(array3));
        
        int[] array4 = {5, 2, 8, 1, 3};
        Arrays.sort(array4);
        System.out.println("Array4 after sorting: " + Arrays.toString(array4));
    }
}





