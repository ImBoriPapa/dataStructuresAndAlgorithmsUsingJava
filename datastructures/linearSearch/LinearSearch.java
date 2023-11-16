package datastructures.linearSearch;

import java.util.stream.IntStream;

public class LinearSearch {

    public static void main(String[] args) {
        final int ARRAY_SIZE = 100;
        final int target = 33;
        final int[] intArray = IntStream.rangeClosed(1, ARRAY_SIZE).toArray();

        final int result = linearSearch(intArray, target);

        printResult(result);
    }

    private static void printResult(int result) {
        final String resultIndex = result == -1 ? "There is no target value" : String.valueOf(result);

        System.out.println("Index of Target: " + resultIndex);
    }

    /**
     * Simple int 배열 선형 탐색
     * @param array: int 배열
     * @param target: 찾을 int 값
     * @return target 이 있을 경우 target 이 배열에서 가지고 있는 인덱스 target 이 없을 경우 -1 반환
     */
    public static int linearSearch(final int[] array, final int target) {
        // 매개변수의 배열을 처음 부터 배열의 마지막(배열의 크기)까지 순회하면서 매개변수 target 과 일치하면 해당 인덱스를 반환
        for (int index = 0; index < array.length; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        // 없을 경우 -1 반환
        return -1;
    }
}
