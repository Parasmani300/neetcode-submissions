class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        int cnt = 0;
        int i =0;
        int j = 0;
        while(i < nums1.length || j < nums2.length)
        {
            if(i >= nums1.length && j < nums2.length){
                arr[cnt++] = nums2[j++];
            }else if(i < nums1.length && j >= nums2.length)
            {
                arr[cnt++] = nums1[i++];
            }else{
                if(nums1[i] < nums2[j])
                    arr[cnt++] = nums1[i++];
                else
                    arr[cnt++] = nums2[j++];
            }
        }

        if(len%2 == 0)
        {
            return (double)((double)arr[len/2] + (double)arr[len/2-1])/2;
        }else{
            return arr[len/2];
        }
    }
}
