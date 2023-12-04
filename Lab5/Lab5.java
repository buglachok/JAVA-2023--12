package Lab5;
import java.util.Arrays;

public class Lab5 {
    // Вар. 6: Insertion sort, Bubble sort - по спаданню, bute[]
    public static void main(String[] args) throws Exception {
        byte[] array = {-128, 127, -10, 6, 7, 100, -50};

        byte[] insertSortedArray = insertionSort(array);
        System.out.println("Insertion sort result: " + Arrays.toString(insertSortedArray));
        byte[] bubbleSortedArray = bubbleSort(array);
        System.out.println("Bubble sort result: " + Arrays.toString(bubbleSortedArray));
    }
    public static byte[] insertionSort(byte[] array) {
        byte[] result = Arrays.copyOf(array, array.length);

        for (int i = 1; i < result.length; i++) {
            byte key = result[i];
            int j = i - 1;
            for (;j >= 0 && result[j] < key; j--) {
                result[j + 1] = result[j];
            }
            
            result[j + 1] = key;
        }

        return result;
    }
    public static byte[] bubbleSort(byte[] array) {
        byte[] result = Arrays.copyOf(array, array.length);
        boolean swapped = false;
    
        do {
            swapped = false;
            for (int i = 1; i < result.length; i++) {
                if (result[i - 1] < result[i]) {
                    byte temp = result[i - 1];
                    result[i - 1] = result[i];
                    result[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    
        return result;
    }
}
