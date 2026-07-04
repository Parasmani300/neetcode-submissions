class Solution {
    public int binarySearch(int[] nums,int left, int right,int target)
    {
        if(left <= right)
        {
            int mid = left + (right - left)/2;

            if(target == nums[mid])
                return mid;
            else if(nums[mid] > target)
                return binarySearch(nums,left,mid-1,target);
            else
                return binarySearch(nums,mid+1,right,target);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
}
