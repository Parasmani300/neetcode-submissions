class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList<>();

        backtrack(s,0,new ArrayList<>(),results);
        return results;
    }

    public void backtrack(String s,Integer start,List<String> current,List<List<String>> results)
    {
        if(start == s.length()){
            results.add(new ArrayList<>(current));
            return;
        }

        for(int end=start;end<s.length();end++)
        {
            if(!isPalindrome(s,start,end))
                continue;

            current.add(s.substring(start,end+1));
            backtrack(s,end+1,current,results);
            current.remove(current.size()-1);
        }
    }

    public boolean isPalindrome(String s,int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
