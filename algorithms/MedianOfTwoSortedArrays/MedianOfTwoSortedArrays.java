class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        
        int i = 0, j = 0, k = 0;
        
        while (i < nums1.length) {
            nums3[k++] = nums1[i++]; 
        }
        
        while (j < nums2.length) {
            nums3[k++] = nums2[j++];
        }
        
        Arrays.sort(nums3);
        
        if (nums3.length % 2 != 0) 
            return (double)nums3[nums3.length / 2]; 
  
        return (double)(nums3[(nums3.length - 1) / 2] + nums3[nums3.length / 2]) / 2.0; 
    }
}