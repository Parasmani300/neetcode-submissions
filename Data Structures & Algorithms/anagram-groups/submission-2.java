class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String out = new String(cArr);
            
            if(!map.containsKey(out))
            {
                List<String> l = new ArrayList<>();
                l.add(str);
                map.put(out,l);
            }else
            {
                List<String> l = map.get(out);
                l.add(str);
                map.put(out,l);
            }
        }

        // List<List<String>> list = new ArrayList<>();
        // for(String key : map.keySet())
        // {
        //     list.add(map.get(key));
        // }
        // return list;
        return new ArrayList<>(map.values());
    }
}
