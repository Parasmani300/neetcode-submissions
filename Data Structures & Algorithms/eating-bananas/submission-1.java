class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<piles.length;i++)  
        {
            max = Math.max(max,piles[i]);
        }
        int ans = max;
        int low = 1;int high = max;
        while(low <= high)
        {
            int mid = low + (high -low)/2;
            int hrs = findHours(piles,mid);

            if(hrs <= h)
            {
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }  

        return ans;    
    }

    public int findHours(int[] piles,int k)
    {
        int hrs = 0;
        for(int i = 0;i<piles.length;i++)
        {
            hrs += (int)Math.ceil((double)piles[i]/k);
        }
        return hrs;
    }
}
