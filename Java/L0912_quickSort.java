public class L0912_quickSort {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    private int partition(int[] A, int p, int r) {
        int i = p-1;

        for (int j=p; j<r; j++) {
            if (A[j] < A[r]) {
                i++;
                int t1 = A[i];
                A[i] = A[j];
                A[j] = t1; 
            }
        }

        int t2 = A[i+1];
        A[i+1] = A[r];
        A[r] = t2;

        return i+1;
    }

    private void quickSort(int[]A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        }
    }
}


/* Complexity Analysis 
 1. Average running time: O(nlogn)
 2. Best running time: O(nlogn)
 3. Worst running time: O(n^2)
 4. Space complexity: O(1) */