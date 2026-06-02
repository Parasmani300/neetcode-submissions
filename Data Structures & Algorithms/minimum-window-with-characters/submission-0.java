class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map  = new HashMap<>();

        for(int i = 0;i<t.length();i++)
        {
            if(!map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),1);
            }else{
                map.put(t.charAt(i),map.get(t.charAt(i)) + 1);
            }
        }

        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        int count = map.size();
        int start = 0;

        while(j < s.length())
        {
            Character rightChar = s.charAt(j);
            if(map.containsKey(rightChar))
            {
                map.put(rightChar,map.get(rightChar)-1);

                if(map.get(rightChar) == 0)
                    count--;
            }

            while(count == 0)
            {
                int windowLen = j-i+1;
                if(windowLen <  minLen){
                    minLen = windowLen;
                    start = i;
                }

                Character leftChar = s.charAt(i);
                if(map.containsKey(leftChar))
                {
                    map.put(leftChar, map.get(leftChar) +1);

                    if(map.get(leftChar) > 0)
                        count++;
                }
                i++;
            }
            j++;
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
