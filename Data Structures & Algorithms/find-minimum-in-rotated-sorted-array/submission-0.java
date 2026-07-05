class Solution {
    public int binSearch(int[] nums,int left,int right)
    {
        if(left == right)
            return nums[left];

        
            int mid  =left + (right-left)/2;

            if(nums[mid] > nums[right])
                return binSearch(nums,mid+1,right);
            else
                return binSearch(nums,left,mid);
        
    }
    public int findMin(int[] nums) {
        return binSearch(nums,0,nums.length-1);
    }
}
