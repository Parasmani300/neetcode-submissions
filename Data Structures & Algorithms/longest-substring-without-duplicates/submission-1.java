class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> set = new HashSet<>();
        int l=0;
        for(int i = l;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(l));
                l = l+1;
            }
            set.add(s.charAt(i));
            longest = Math.max(longest,set.size());
        }
        return longest;
    }
}
