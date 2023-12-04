package Lab4;

public class Lab4 {
    // Вар. 6: 6, 36, 66
    public static void main(String[] args) {
        int[] array = {3, 8, 12, 6, 10, 7, 15};

        // task6:
        int task6_result = findMinElementMultipleOfFive(array);
        if (task6_result != -1) {
            System.out.println("Result task6: " + task6_result);
        }

        // task36:
        double task36_result = calculateGeometricMean(array);
        System.out.println("Result task36: " + task36_result);

        // task66:
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6, 7};
        int[] C = mergeArrays(A, B);

        System.out.print("Result task66: { ");
        for (int element : C) {
            System.out.print(element + " ");
        }
        System.out.print("}\n");
    }
    // task6
    public static int findMinElementMultipleOfFive(int[] array) {
        int minElement = Integer.MAX_VALUE;

        for (int element : array) {
            if (element % 5 == 0 && element < minElement) {
                minElement = element;
            }
        }

        if (minElement == Integer.MAX_VALUE) {
            System.out.println("There are no elements in the array that are multiples of 5. Return -1");
            return -1;
        }

        return minElement;
    }
    // task36
    public static double calculateGeometricMean(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = array[0];
        int max = array[0];

        for (int element : array) {
            if (element < min) {
                min = element;
            }

            if (element > max) {
                max = element;
            }
        }

        double geometricMean = Math.sqrt((double) min * max);
        return geometricMean;
    }
    // task66
    public static int[] mergeArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] C = new int[n + m];

        System.arraycopy(A, 0, C, 0, n);
        System.arraycopy(B, 0, C, n, m);

        return C;
    }
}
    

