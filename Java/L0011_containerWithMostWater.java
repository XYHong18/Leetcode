public class L0011_containerWithMostWater {
    public int maxArea(int[] height) {
        int res = 0;
        int i = 0, j = height.length-1;
        int area;
        
        while (i < j) {
            area = (j-i) * Math.min(height[i], height[j]);
            res = Math.max(area, res);
            
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}


/*
Complexity Analaysis:
1. Time Analysis: O(n)
2. Space Analysis: O(1)
*/