class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            int locArea = -1;
            int minHeight = Integer.MAX_VALUE;
            for(int j = i;j<n;j++)
            {
                minHeight = Math.min(minHeight,heights[j]);
                locArea = minHeight* (j-i+1);
                if(locArea > maxArea)
                    maxArea = locArea;
            }
        }
        return maxArea;
    }
}
