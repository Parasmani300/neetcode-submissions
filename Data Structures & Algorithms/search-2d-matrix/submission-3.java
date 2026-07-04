class Solution {
    public boolean binarySearch(int[] arr,int left,int right,int target)
    {
        if(left <= right)
        {
            int mid = left + (right - left)/2;

            if(arr[mid] == target)
                return true;
            else if(arr[mid] > target)
                return binarySearch(arr,left,mid-1,target);
            else
                return binarySearch(arr,mid+1,right,target);
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++)
        {
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1])
            {
                return binarySearch(matrix[i],0,matrix[i].length-1,target);
            }
        }
        return false;
    }
}
