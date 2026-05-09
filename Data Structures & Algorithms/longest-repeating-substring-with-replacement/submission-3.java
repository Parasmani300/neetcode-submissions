class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        for(int i = 0;i<s.length();i++)
        {
            int[] arr = new int[26];
            int cnt = 0;
            int maxLen = 0;
            for(int j = i;j<s.length();j++)
            {
                arr[s.charAt(j) - 'A']++;
                maxLen = Math.max(maxLen,arr[s.charAt(j)-'A']);
                int changes = (j-i+1) - maxLen;
                if(changes <= k)
                    res = Math.max(res,j-i+1);
                else
                    break;
            }
        }

        return res;
    }
}
