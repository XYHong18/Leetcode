public class L0167_twoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] res = new int[2];
        
        if (n < 2) {
            return null;
        }
        
        int i = 0, j = n-1;
        
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i+1;
                res[1] = j+1;
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        
        return res;
    }
}


/*
Complexity Analysis:
1. Time Complexity: O(n)
2. Space Complexity: O(1) 
*/