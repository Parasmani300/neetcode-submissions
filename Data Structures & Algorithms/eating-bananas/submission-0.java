class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k =1;
        while(true)
        {
            int hrs = 0;
            for(int i = 0;i<piles.length;i++)
            {
                // hrs += (int)Math.ceil((double)piles[i]/k);
                hrs += Math.ceil((piles[i] +k -1)/k);
            }
            if(hrs<= h)
                return k;
            k++;
        }
        
    }
}
