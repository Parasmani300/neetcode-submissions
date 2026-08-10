class Solution {
    public int lastStoneWeight(int[] stones) {
        int weight = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size() > 1)
        {
            int first = pq.poll();
            int second = pq.poll();
            if(first != second){
                pq.offer(Math.abs(first - second));
            }
        }

        return pq.isEmpty()?0:pq.peek();
    }

}
