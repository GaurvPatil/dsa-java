
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = 0; j <= end; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }

}
