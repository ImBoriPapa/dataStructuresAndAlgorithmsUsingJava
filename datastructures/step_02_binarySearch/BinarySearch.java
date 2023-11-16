package datastructures.binarySearch;

import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) {

        int[] intArray = IntStream.rangeClosed(1, 1000).toArray();

        int result = binarySearch(intArray, 345);

        System.out.println("Result: " + result);
    }

    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}
