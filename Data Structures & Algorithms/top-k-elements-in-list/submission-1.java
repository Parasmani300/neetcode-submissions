class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->{
            return Integer.compare(map.get(a),map.get(b));
        });

        for(Integer key : map.keySet())
        {
            minHeap.offer(key);
            if(minHeap.size() > k)
            {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0;i<k;i++)
        {
            res[i] = minHeap.poll();
        }
        return res;
    }
}
