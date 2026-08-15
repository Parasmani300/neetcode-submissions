class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,0,new ArrayList<>(),results,target);
        return results;
    }

    public void backtrack(int[] candidates,int index,List<Integer> current,List<List<Integer>> results,int target)
    {
        if(target == 0)
        {
            results.add(new ArrayList<>(current));
            return;
        }

        for(int i = index;i<candidates.length;i++)
        {
            if(i > index && candidates[i] == candidates[i-1])
                continue;
            
            if(candidates[i] > target)
                break;
            
            current.add(candidates[i]);
            backtrack(candidates,i+1, current,results,target-candidates[i]);
            current.remove(current.size()-1);
        }
    }
}
