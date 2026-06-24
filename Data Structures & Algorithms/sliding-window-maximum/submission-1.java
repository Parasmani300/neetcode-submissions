class Solution {
    public int maxInWindow(int[] nums,int left,int right)
    {
        int max = Integer.MIN_VALUE;
        for(int i = left;i<right;i++)
        {
            if(nums[i] > max)
                max = nums[i];
        }
        return max;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n-k+1];
        int lastMax = Integer.MIN_VALUE;
        for(int i = 0;i<n-k+1;i++)
        {
            if(i == 0 || lastMax == arr[i-1]){
                arr[i] = maxInWindow(nums,i,i+k);
                lastMax = arr[i];
            }
            else {
                arr[i] = Math.max(lastMax,nums[i+k-1]);
            }
        }
        return arr;
    }
}
