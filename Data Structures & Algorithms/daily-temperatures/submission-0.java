class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            int count = 0;
            for(int j = i+1;j<n;j++)
            {
                if(temperatures[i] < temperatures[j]){
                    nums[i] = (++count);
                    break;
                }
                count++;
            }
        }
        return nums;
    }
}
