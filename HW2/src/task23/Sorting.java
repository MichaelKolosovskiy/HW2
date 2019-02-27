package task23;
import java.util.Random;

public class Sorting {

    int[] createArray(int i) {
        int[] array = new int[i];
        for (int j = 0; j < array.length; j++) {
            array[j] = new Random().nextInt(54);
        }
        return array;
    }

    private static void swap(int i, int j) {
        int buf = j;
        j = i;
        i = buf;
    }

    public static int[] insertionSort(int[] array) {
        int buf;
        for (int i = 1; i < array.length; i++) {
            buf = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < buf) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = buf;
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length - j; i++) {
                if (array[i] < array[i - 1]) {
                    swap(i, i - 1);
                }
            }
        }
        return array;
    }

    public static int[] shellSort(int[] array) {
        int x = array.length / 2;
        while (x > 0) {
            int j = 0;
            for (int i = x; i < array.length; i++) {
                int buf = array[i];
                for (j = i; j >= x && array[j - x] > buf; j -= x) {
                    array[j] = array[j - x];
                }
                array[j] = buf;
            }
            x = x / 2;
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[element]) {
                    element = j;
                }
            }
            swap(element, i);
        }
        return array;
    }
}
