class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(String str: strs)
        {
            encodedString += (str.length()+"#" + str);
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> l = new ArrayList<>();
        for(int i = 0;i<str.length();)
        {   
            int j = i;
            while(str.charAt(j) != '#')
                j++;
            int len = Integer.parseInt(str.substring(i,j));
            l.add(str.substring(j+1,j+1+len));
            i = j+1+len;
        }
        return l;
    }
}
