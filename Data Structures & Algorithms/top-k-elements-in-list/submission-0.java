class Solution {
    static class Pair
    {
        int first;
        int second;

        public Pair(int first,int second)
        {
            this.first = first;
            this.second = second;
        }

        public int getSecond()
        {
            return this.second;
        }

        public int getFirst()
        {
            return this.first;
        }




    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Pair> map = new HashMap<>();
        for(int num : nums)
        {
            if(!map.containsKey(num)){
                map.put(num,new Pair(num,1));
            }else{
                map.put(num,new Pair(num,map.get(num).getSecond()+1));
            }
        }
        List<Pair> l = new ArrayList<>(map.values());
        Collections.sort(l,(a,b)-> Integer.compare(b.getSecond(),a.getSecond()));
    
        int[] arr = new int[k];
        for(int i = 0;i<k;i++)
        {
            arr[i] = l.get(i).getFirst();
        }
        return arr;
    }
}
