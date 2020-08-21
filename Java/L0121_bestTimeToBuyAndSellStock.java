public class L0121_bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int res = 0;
        int n = prices.length;
        int low;
        
        if (n==0) {
            return 0;
        } else {
            low = prices[0];
        }
        
        for (int i=1; i<n; i++) {
            if (prices[i] > low) {
                res = Math.max(res, prices[i]-low);
            } else {
                low = prices[i];
            }
        }
        
        return res;
    }
}