import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        // Sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 5, 8, 9]

        // Binary Search (array must be sorted)
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("Index of 8: " + index);

        // Fill (replace all values)
        int[] filledArr = new int[5];
        Arrays.fill(filledArr, 7);
        System.out.println(Arrays.toString(filledArr)); // [7, 7, 7, 7, 7]

        // Compare
        int[] arr2 = {1, 2, 5, 8, 9};
        System.out.println(Arrays.equals(arr, arr2)); // true

        // Copy
        int[] copy = Arrays.copyOf(arr, 3);
        System.out.println(Arrays.toString(copy)); // [1, 2, 5]

        // Copy Range
        int[] rangeCopy = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(rangeCopy)); // [2, 5, 8]
    }
}
