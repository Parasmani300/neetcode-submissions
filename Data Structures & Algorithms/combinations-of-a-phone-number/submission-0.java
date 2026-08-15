class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();
        if(digits == null || digits.length() == 0)
            return results;
        String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        backtrack(digits,0,new StringBuilder(),results,mapping);
        return results;
    }

    public void backtrack(String digits,Integer index,StringBuilder current,List<String> results,String[] mapping)
    {
        if(index == digits.length()){
            results.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index)-'0'];

        for(char letter : letters.toCharArray())
        {
            current.append(letter);
            backtrack(digits,index+1,current,results,mapping);
            current.deleteCharAt(current.length()-1);
        }
    }
}
