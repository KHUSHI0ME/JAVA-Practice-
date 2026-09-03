public class MergeSort {

    // TIME COMPLEXITY: O(n log n)

    public static void conquer(int arr[], int si, int ei) {

        int merged[] = new int[ei - si + 1];

        int mid = si + (ei - si) / 2;

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Compare elements from both halves

        // 0(n)
        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Remaining elements of left half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Remaining elements of right half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged array back into original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }   // ← This } was missing

    public static void divide(int arr[], int si, int ei) {


        // Base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Divide left half
        divide(arr, si, mid);

        // Divide right half
        divide(arr, mid + 1, ei);

        // Merge both halves
        conquer(arr, si, ei);
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        int n = arr.length;

        divide(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}