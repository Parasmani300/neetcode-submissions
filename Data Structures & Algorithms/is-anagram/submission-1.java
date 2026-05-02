class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabets = new int[27];
        if(s.length() != t.length())
            return false;
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
            {
                alphabets[s.charAt(i) - 97] += 1; 
            }
        }

        for(int i = 0;i<t.length();i++)
        {
            if(t.charAt(i) >= 97 && t.charAt(i) <= 122)
            {
                alphabets[t.charAt(i) - 97] -= 1; 
            }
        }

        for(int i= 0;i<alphabets.length;i++)
        {
            if(alphabets[i] != 0)
                return false;
        }
        return true;
    }
}
