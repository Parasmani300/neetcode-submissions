class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <=1)
            return nums.length;
       Arrays.sort(nums); //nlogn
        int lSequence = 1;
        int tempSequence = 1;
       for(int i = 1;i<nums.length;i++) 
       {
            if(nums[i] == nums[i-1])
                continue;
            if(nums[i] == nums[i-1] + 1){
                tempSequence++;
            }else{
                if(tempSequence > lSequence)
                    lSequence = tempSequence;
                tempSequence = 1;
            }
       }
       return Math.max(tempSequence,lSequence);
    }
}
