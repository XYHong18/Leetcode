
public class L912_mergeSort {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
                  
    private void merge(int[] A, int l, int p, int r) {
        int n1 = p-l+1;
        int n2 = r-p;
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i=0; i<n1; i++) {
            L[i] = A[l+i];
        }
        
        for (int j=0; j<n2; j++) {
            R[j] = A[p+j+1];
        }
        
        int k = l;
        int k1 = 0;
        int k2 = 0;
        
        while (k1<n1 && k2<n2) {
            if (L[k1] < R[k2]) {
                A[k] = L[k1];
                k1++;
            } else {
                A[k] = R[k2];
                k2++;
            }
            k++;
        }
        
        while (k1<n1) {
            A[k] = L[k1];
            k1++;
            k++;
        }
        
        while (k2<n2) {
            A[k] = R[k2];
            k2++;
            k++;
        }
    }
    
    private void mergeSort(int[] A, int l, int r) {
        if (l < r) {
            int p = (l+r) / 2;
            mergeSort(A, l, p);
            mergeSort(A, p+1, r);
            merge(A, l, p, r);
        }
        
    }

}


/* Complexity Analysis 
# Running Time: O(nlogn)
# Space Complexity: O(1) */