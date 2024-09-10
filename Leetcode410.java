
public class Leetcode410 {

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;

        System.out.println("minimized largest sum of the split : " + splitArray(arr, k));
    }

    static int splitArray(int[] arr, int k) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int middle = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int num : arr) {
                if (sum + num > middle) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = middle + 1;
            } else {
                end = middle;
            }

        }
        return end;

    }

}
