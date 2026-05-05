class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <=1)
            return nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);

        int longest = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(set.contains(nums[i] - 1))
                continue;
            int large = 0;
            while(set.contains(nums[i] + large))
                large++;
            longest = Math.max(longest,large);
        }
        return longest;
    }
}
