class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pArr = new int[nums.length];

        for(int i = 0;i<nums.length;i++)
        {
            pArr[i] = 1;   
            for(int j=0;j<nums.length;j++)
            {
                if(i != j)
                    pArr[i] *= nums[j];
            }
        }
        return pArr;
    }
}  
