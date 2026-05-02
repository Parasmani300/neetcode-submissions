class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int k = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
        }

        for(Integer key : map.keySet()){
            nums[k++] = key;
        }
        return k;
    }
}