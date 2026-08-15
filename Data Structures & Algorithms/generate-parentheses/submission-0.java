class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n,0,0,new StringBuilder(),result);
        return result;
    }

    public void backtrack(int n,int open,int closed,StringBuilder current,List<String> result){
        if(open == n && closed == n){
            result.add(current.toString());
        }

        if(open < n){
            current.append("(");
            backtrack(n,open+1,closed,current,result);
            current.deleteCharAt(current.length() - 1);
        }

        if(closed < open){
            current.append(")");
            backtrack(n,open,closed+1,current,result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
