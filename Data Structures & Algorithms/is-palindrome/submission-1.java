class Solution {
    public boolean isPalindrome(String s) {
        /*StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }*/
        String finalStr = s;
        int i = 0;
        int j = finalStr.length()-1;
        while(i <= j)
        {
            if(!Character.isLetterOrDigit(finalStr.charAt(i)))
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(finalStr.charAt(j)))
            {
                j--;
                continue;
            }
            if(Character.toLowerCase(finalStr.charAt(i)) != Character.toLowerCase(finalStr.charAt(j)))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
