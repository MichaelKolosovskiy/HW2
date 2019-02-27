package task23;
import java.util.Random;

public class Sorting {

    int[] createArray(int i) {
        int[] arr = new int[i];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = new Random().nextInt(54);
        }
        return arr;
    }

    private static void swap(int i, int j) {
        int buf = j;
        j = i;
        i = buf;
    }

    public static int[] insertionSort(int[] arr) {
        int buf;
        for (int i = 1; i < arr.length; i++) {
            buf = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < buf) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = buf;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(i, i - 1);
                }
            }
        }
        return arr;
    }

    public static int[] shellSort(int[] arr) {
        int x = arr.length / 2;
        while (x > 0) {
            int j = 0;
            for (int i = x; i < arr.length; i++) {
                int buf = arr[i];
                for (j = i; j >= x && arr[j - x] > buf; j -= x) {
                    arr[j] = arr[j - x];
                }
                arr[j] = buf;
            }
            x = x / 2;
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int element = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[element]) {
                    element = j;
                }
            }
            swap(element, i);
        }
        return arr;
    }
}

