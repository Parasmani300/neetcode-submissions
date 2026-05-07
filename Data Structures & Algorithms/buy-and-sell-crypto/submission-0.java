class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int tot = 0;
        for(int i = 1;i<prices.length;i++)
        {
            tot = Math.max(tot,prices[i] - min);
            if(prices[i] < min)
                min = prices[i];
        }
        return tot;
    }
}
