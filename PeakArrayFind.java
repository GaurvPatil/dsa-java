
public class PeakArrayFind {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = peakNumber(arr);
        int firstSearch = orderAgnosticSearch(arr, target, 0, peak);
        int secondSearch = orderAgnosticSearch(arr, target, peak, arr.length - 1);

        if (firstSearch != -1) {

            System.out.println(firstSearch);
        }
        System.out.println(secondSearch);
    }

    static int peakNumber(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start - 1) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start;
    }

    static int orderAgnosticSearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return -1;

    }

}
