class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String finalStr = sb.toString();
        int i = 0;
        int j = sb.length()-1;
        while(i <= j)
        {
            if(finalStr.charAt(i) != finalStr.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}
