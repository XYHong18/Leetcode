public class L0050_Pow(x, n) {
    public double myPow(double x, int n) {
        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                n += 2;
            }
            return binarySearch(1/x, 0, -n);
        } else {
            return binarySearch(x, 0, n);
        }
    }
    
    private double binarySearch(double x, int l, int r) {
        if (l < r) {
            int mid = l + (r-l)/2;
            double res = binarySearch(x, l, mid);
            return ((r-l)%2 == 0) ? (res * res) : (x * res * res);
        } else {
            return 1.0;
        }
    }
}


/*
Complexity Analysis:
1. Time Complexity: O(log(n))
2. Space Complexity: O(1)
*/
