class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int maxFreq = 0;
        int  j= 0;
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            arr[ch-'A']++;

             maxFreq = Math.max(maxFreq,arr[ch-'A']);
             int windowLength = i-j+1;
             while(windowLength - maxFreq > k)
             {
                arr[s.charAt(j)-'A']--;
                j++;
                windowLength = i-j+1;
             }

             res = Math.max(windowLength,res);
        }
        return res;
    }
}
