class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result,target);
        return result;
    }

    public void backtrack(int[] nums,int index,List<Integer> current,List<List<Integer>> result,int target)
    {
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0)
            return;

        for(int i = index;i<nums.length;i++){
            current.add(nums[i]);
            backtrack(nums,i,current,result,target-nums[i]);
            current.remove(current.size()-1);
        }
    }
}
